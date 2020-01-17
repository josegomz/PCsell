/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.ProcesadorDisipador;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author 706
 */
public class ProcesadorDisipadorModel implements IProcesadorDisipadorModel{

    private SessionFactory sessionFactory;
    private Session session;
    
    @Override
    public List<ProcesadorDisipador> obtenerRegistros() {
        List<ProcesadorDisipador> lista = null;
        try {
            lista = (ArrayList<ProcesadorDisipador>) session.createQuery("FROM Procesador_disipador").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public ProcesadorDisipador obtenerRegistro(Long id) {
        ProcesadorDisipador procesadorDisipador = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            procesadorDisipador = (ProcesadorDisipador) session.get(ProcesadorDisipador.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return procesadorDisipador;
    }

    @Override
    public void crearRegistro(ProcesadorDisipador procesadorDisipador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(procesadorDisipador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(ProcesadorDisipador procesadorDisipador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(procesadorDisipador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(ProcesadorDisipador procesadorDisipador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(procesadorDisipador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

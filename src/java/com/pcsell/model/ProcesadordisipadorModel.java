/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Procesadordisipador;
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
public class ProcesadordisipadorModel implements IProcesadordisipadorModel{

    private SessionFactory sessionFactory;
    private Session session;
    
    @Override
    public List<Procesadordisipador> obtenerRegistros() {
        List<Procesadordisipador> lista = null;
        try {
            lista = (ArrayList<Procesadordisipador>) session.createQuery("FROM Procesadordisipador").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public Procesadordisipador obtenerRegistro(Long id) {
        Procesadordisipador procesadorDisipador = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            procesadorDisipador = (Procesadordisipador) session.get(Procesadordisipador.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return procesadorDisipador;
    }

    @Override
    public void crearRegistro(Procesadordisipador procesadorDisipador) {
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
    public void actualizarRegistro(Procesadordisipador procesadorDisipador) {
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
    public void eliminarRegistro(Procesadordisipador procesadorDisipador) {
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

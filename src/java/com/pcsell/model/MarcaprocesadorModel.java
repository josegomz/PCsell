/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Marcaprocesador;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labtw13
 */
public class MarcaprocesadorModel implements IMarcaprocesadorModel{
    
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public Marcaprocesador obtenerRegistro(Long id) {
        Marcaprocesador mp = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            mp = (Marcaprocesador) session.get(Marcaprocesador.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return mp;
    }

    @Override
    public List<Marcaprocesador> obtenerRegistros() {
        List<Marcaprocesador> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Marcaprocesador>) session.createQuery("FROM Marcaprocesador").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public void crearRegistro(Marcaprocesador marcaprocesador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(marcaprocesador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Marcaprocesador marcaprocesador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(marcaprocesador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Marcaprocesador marcaprocesador) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(marcaprocesador);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Discoduro;
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
public class DiscoduroModel implements IDiscoduroModel{

    private SessionFactory sessionFactory;
    private Session session;
    
    @Override
    public List<Discoduro> obtenerRegistros() {
        List<Discoduro> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Discoduro>) session.createQuery("FROM Discoduro").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public Discoduro obtenerRegistro(Long id) {
        Discoduro disco = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            disco = (Discoduro) session.get(Discoduro.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return disco;
    }

    @Override
    public void crearRegistro(Discoduro disco) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(disco);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Discoduro disco) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(disco);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Discoduro disco) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(disco);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

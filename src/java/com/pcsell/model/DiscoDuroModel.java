/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.DiscoDuro;
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
public class DiscoDuroModel implements IDiscoDuroModel{

    private SessionFactory sessionFactory;
    private Session session;
    
    @Override
    public List<DiscoDuro> obtenerRegistros() {
        List<DiscoDuro> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<DiscoDuro>) session.createQuery("FROM Disco_duro").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public DiscoDuro obtenerRegistro(Long id) {
        DiscoDuro disco = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            disco = (DiscoDuro) session.get(DiscoDuro.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return disco;
    }

    @Override
    public void crearRegistro(DiscoDuro disco) {
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
    public void actualizarRegistro(DiscoDuro disco) {
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
    public void eliminarRegistro(DiscoDuro disco) {
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

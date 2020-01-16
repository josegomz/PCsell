/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.TarjetaVideo;
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
public class TarjetaVideoModel implements ITarjetaVideoModel{
    
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<TarjetaVideo> obtenerRegistros() {
        List<TarjetaVideo> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<TarjetaVideo>) session.createQuery("FROM Tarjeta_video").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public TarjetaVideo obtenerRegistro(Long id) {
        TarjetaVideo tarjeta = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            tarjeta = (TarjetaVideo) session.get(TarjetaVideo.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return tarjeta;
    }

    @Override
    public void crearRegistro(TarjetaVideo tarjeta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(tarjeta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(TarjetaVideo tarjeta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(tarjeta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(TarjetaVideo tarjeta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(tarjeta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

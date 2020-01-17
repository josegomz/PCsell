/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcsell.model;

import com.pcsell.entity.Procesador;
import com.pcsell.entity.Venta;
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
public class VentaModel implements IVentaModel{
    
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Venta> obtenerRegistros() {
        List<Venta> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Venta>) session.createQuery("FROM Venta").list();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public Venta obtenerRegistro(Long id) {
        Venta venta = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            venta = (Venta) session.get(Venta.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return venta;
    }

    @Override
    public void crearRegistro(Venta venta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(venta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Venta venta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(venta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Venta venta) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(venta);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

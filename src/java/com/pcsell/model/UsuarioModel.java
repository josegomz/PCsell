/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Usuario;
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
public class UsuarioModel implements IUsuarioModel{
    
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> lista = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            lista = (ArrayList<Usuario>) session.createQuery("FROM Usuario").list();
            for (Usuario u : lista) {
                System.out.println("Nombre: " + u.getNombre());
            }
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public Usuario obtenerRegistro(Long id) {
        Usuario usuario= null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            usuario = (Usuario) session.get(Usuario.class, id);
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(usuario);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        IUsuarioModel iUsuarioModel = new UsuarioModel();
        iUsuarioModel.obtenerRegistros();
    }
}

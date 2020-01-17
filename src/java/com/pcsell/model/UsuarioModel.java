/*
 * 
 */
package com.pcsell.model;

import com.pcsell.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
             System.out.println("-ZZZZZZ---------------------------Nombre: " + usuario.getCoreoElectronico());
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            System.out.println("----------------------------Nombre: " + usuario.getCoreoElectronico());
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
    
    public boolean obtenerUsuarioPorCorreoYcontrasenia(String username, String password) {
        boolean c = false;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            String hql = "SELECT nombre FROM Usuario WHERE coreo_electronico =:userName AND contrasenia =:passWord";
            Query query = session.createQuery(hql);
            query.setParameter("userName", username);
            query.setParameter("passWord", password);
            List results = query.list();
            session.close();
            sessionFactory.close();
            if (results.size() > 0) {
                return true;
            }
            return false;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }
}

package module;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2017/3/6.
 */
public class HibernateInit {
    private static SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
    public static Session getSession (){
        Session session = null;
        session = sessionFactory.openSession();
        return  session;
    }
    public static void close(Session session){
        if (session!=null) {
            if (session.isOpen()){
                session.close();
            }
        }
    }
    public static void rollback(Session session){
        session.getTransaction().rollback();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

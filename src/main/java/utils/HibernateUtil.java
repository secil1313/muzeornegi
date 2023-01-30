package utils;



import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                configuration.addAnnotatedClass(Eser.class);
                configuration.addAnnotatedClass(Müze.class);
                configuration.addAnnotatedClass(Sanatci.class);
                configuration.addAnnotatedClass(Sergi.class);
                configuration.addAnnotatedClass(Ziyaretci.class);
                sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return sessionFactory;
    }

}

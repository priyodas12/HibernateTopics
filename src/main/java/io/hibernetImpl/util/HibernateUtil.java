package io.hibernetImpl.util;



import io.hibernetImpl.model.Card;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {


    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            try{
                Configuration configuration=new Configuration();

                Properties settings=new Properties();

                settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
                settings.put(Environment.URL,"jdbc:mysql://localhost/hibernate_db");
                settings.put(Environment.USER,"root");
                settings.put(Environment.PASS,"Priyo123");
                settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");

                settings.put(Environment.SHOW_SQL,"true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
                settings.put(Environment.HBM2DDL_AUTO,"create-drop");
                settings.put(Environment.AUTOCOMMIT,"true");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Card.class);

                ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory=configuration.buildSessionFactory(serviceRegistry);

                }catch (Exception e){
                    e.fillInStackTrace();
                }
            }
            return  sessionFactory;
        }

    }


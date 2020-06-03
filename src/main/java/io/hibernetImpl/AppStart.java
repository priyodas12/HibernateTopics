package io.hibernetImpl;


import io.hibernetImpl.model.Card;
import io.hibernetImpl.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.UUID;

public class AppStart {

    public static void main(String[] args) {



        Card card=new Card(UUID.randomUUID().toString(),"Supp","3489-0882-1217-1211","ramesh das",1200);

        Transaction transaction=null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            System.out.println(card);

            session.save(card);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }
}

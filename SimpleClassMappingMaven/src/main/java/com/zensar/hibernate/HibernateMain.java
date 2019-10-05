package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
        Configuration c = new Configuration().configure();
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Product p = new Product();
        p.setProductId(101);
        p.setName("Computer");
        p.setBrand("HP");
        p.setPrice(60000);
        
        s.save(p);
        System.out.println("product is saved");
        t.commit();
        s.close();
    }
}

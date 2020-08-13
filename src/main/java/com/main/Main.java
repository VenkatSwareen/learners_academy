package com.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Students;
import com.model.Subject;
import com.model.Teachers;
import com.model.Class;
public class Main {

	public static void main(String[] args) {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			SessionFactory factory=configuration.buildSessionFactory(builder.build());
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
		    Subject s1=new Subject("JAVA");
			Subject s2=new Subject("BEE");
			Subject s3=new Subject("EG");
			Teachers t1=new Teachers("aravind", s1);
			Teachers t2=new Teachers("binod",s2);
			Teachers t3=new Teachers("surekha",s3);
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.save(t1);
			session.save(t2);
			session.save(t3);
			Students st1=new Students("kaushik");
			Students st2=new Students("venkat");
			Students st3=new Students("rakesh");
			Students st4=new Students("kumari");
			Students st5=new Students("sandeep");
			Students st6=new Students("bhavna");
			Students st7=new Students("nikhila");
			Class c1=new Class("CSE",s1);
			Class c2=new Class("ECE",s2);
			Class c3=new Class("MECH",s3);
         	st1.setClas(c1);
         	st2.setClas(c1);
         	st3.setClas(c2);
         	st4.setClas(c2);
         	st5.setClas(c2);
         	st6.setClas(c3);
         	st7.setClas(c3);
         	session.save(c1);
     	    session.save(c2);
     	    session.save(c3);
     	    session.save(st1);
     	    session.save(st2);
     	    session.save(st3);
     	    session.save(st4);
     	    session.save(st5);
     	    session.save(st6);
     	    session.save(st7);
     	Query query=session.createQuery("from com.model.Class");
			List<Class> cList=query.list();
			System.out.println(cList);
			transaction.commit();
			session.close();
			factory.close();
			}

	}
package com.usastores.xml.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.usastores.xml.bean.StoreBean;

public class HibernateXMLTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryObject.getInstance();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		StoreBean bean = new StoreBean();
		bean.setStoreName("DFC");
		bean.setStoreArea("HYD");
		bean.setZipcode(500011);
		bean.setDistanceInMiles(5.5f);
		Integer ref = (Integer) session.save(bean);
		System.out.println(ref+" "+"Success");
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}

}

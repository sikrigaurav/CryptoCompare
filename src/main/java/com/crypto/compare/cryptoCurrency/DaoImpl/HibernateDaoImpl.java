package com.crypto.compare.cryptoCurrency.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import com.crypto.compare.cryptoCurrency.Dao.HibernateDao;

public class HibernateDaoImpl implements HibernateDao {
	
	@Override
	public Session getSession(Class c) {
		Configuration config = new Configuration().configure().addAnnotatedClass(c);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();	
		return session;
	}

}

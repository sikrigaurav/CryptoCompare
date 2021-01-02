package com.crypto.compare.cryptoCurrency.Dao;

import org.hibernate.Session;

public interface HibernateDao {
	Session getSession(Class c);
}

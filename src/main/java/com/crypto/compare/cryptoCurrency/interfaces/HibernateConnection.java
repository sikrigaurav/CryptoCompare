package com.crypto.compare.cryptoCurrency.interfaces;

import org.hibernate.Session;

public interface HibernateConnection {
	Session getSession(Class c);
}

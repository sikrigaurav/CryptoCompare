package com.crypto.compare.cryptoCurrency.resource;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.crypto.compare.cryptoCurrency.Dao.HibernateDao;
import com.crypto.compare.cryptoCurrency.DaoImpl.HibernateDaoImpl;
import com.crypto.compare.cryptoCurrency.model.Currency;

@RestController
@RequestMapping("/crypto")
public class CryptoComparator{
	
	@Autowired
	HibernateDao hib;
	
	@Autowired
	private WebClient.Builder builder;
	
	@Value("${service.url}")
	private String url;
	
	@Value("${service.key}")
	private String key; 
	
	@Value("${service.host}")
	private String host; 
	
	@RequestMapping("/{currName}")
	public Currency[] getCurrencyRate(@PathVariable("currName") String currName)
	{
		System.out.println("Reached here");
		Date now = new Date();
		try {
			Currency[] currencies = builder.build()
									.get()
									.uri(formUrl(currName))
									.header("x-rapidapi-host", host)
									.header("x-rapidapi-key", key)
									.retrieve()
									.bodyToMono(Currency[].class)
									.block();
			
			
			Session session = hib.getSession(Currency.class);
			session.beginTransaction();
			for(int i = 0; i< currencies.length; i++)
			{
				currencies[i].setSysdate(now);
				currencies[i].setCurrency_type(currName);
				session.save(currencies[i]);
			}
			session.getTransaction().commit();
			session.close();
			System.out.println("Reached here.....");
			System.out.println(currencies[0].getId());
			return currencies;
		}
		catch(WebClientResponseException e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	public String formUrl(String currName)
	{
		return url+"?vs_currency="+currName;
	}

}

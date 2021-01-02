package com.crypto.compare.cryptoCurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import com.crypto.compare.cryptoCurrency.DaoImpl.HibernateDaoImpl;

@SpringBootApplication
public class CryptoCurrencyApplication {

	@Bean
	public WebClient.Builder getBuilder()
	{
		return WebClient.builder();
	}
	
	@Bean
	public HibernateDaoImpl getHibernateDaoObject()
	{
		return new HibernateDaoImpl();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CryptoCurrencyApplication.class, args);
	}

}

package com.crypto.compare.cryptoCurrency.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency implements Serializable{
	
	public Currency() 
	{
		
	}
	
	@Id
	@Column(length = 100)
	private String id;
	@Column(length = 100)
	private String name;
	@Column(length = 100)
	private String symbol;
	@Column(length = 100)
	private String currency_type;
	@Column(length = 100)
	private double current_price;
	@Column(length = 100)
	private double market_cap;
	@Column(length = 100)
	private int market_cap_rank;
	@Column(length = 100)
	private double high_24h;
	@Column(length = 100)
	private double low_24h;
	@Column(length = 100)
	private double price_change_24h;
	@Column(length = 100)
	private double price_change_percentage_24h;
	@Column(length = 100)
	private double market_cap_change_24h;
	@Column(length = 100)
	private Date last_updated;
	@Id
	@Column(length = 100)
	private Date sysdate;
	
	public Date getSysdate() {
		return sysdate;
	}
	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public double getMarket_cap() {
		return market_cap;
	}
	public void setMarket_cap(double market_cap) {
		this.market_cap = market_cap;
	}
	public int getMarket_cap_rank() {
		return market_cap_rank;
	}
	public void setMarket_cap_rank(int market_cap_rank) {
		this.market_cap_rank = market_cap_rank;
	}
	public double getHigh_24h() {
		return high_24h;
	}
	public void setHigh_24h(double high_24h) {
		this.high_24h = high_24h;
	}
	public double getLow_24h() {
		return low_24h;
	}
	public void setLow_24h(double low_24h) {
		this.low_24h = low_24h;
	}
	public double getPrice_change_24h() {
		return price_change_24h;
	}
	public void setPrice_change_24h(double price_change_24h) {
		this.price_change_24h = price_change_24h;
	}
	public double getPrice_change_percentage_24h() {
		return price_change_percentage_24h;
	}
	public void setPrice_change_percentage_24h(double price_change_percentage_24h) {
		this.price_change_percentage_24h = price_change_percentage_24h;
	}
	public double getMarket_cap_change_24h() {
		return market_cap_change_24h;
	}
	public void setMarket_cap_change_24h(double market_cap_change_24h) {
		this.market_cap_change_24h = market_cap_change_24h;
	}
	public Date getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}
	public String getCurrency_type() {
		return currency_type;
	}
	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}

}

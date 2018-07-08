package com.acc.dto;

import java.io.Serializable;
import java.util.Date;

public class Rechargedto implements Serializable{
	 public String rechargeno;
	   public String provider;
	   public String mobile;
	   public Date date;
	   public float amount;
	public String getRechargeno() {
		return rechargeno;
	}
	public void setRechargeno(String rechargeno) {
		this.rechargeno = rechargeno;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}

package com.acc.command;

import java.io.Serializable;

public class RechargeCommand implements Serializable {
  public String rechargeno;
  public String mobile;
public String getRechargeno() {
	return rechargeno;
}
public void setRechargeno(String rechargeno) {
	this.rechargeno = rechargeno;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
  
}

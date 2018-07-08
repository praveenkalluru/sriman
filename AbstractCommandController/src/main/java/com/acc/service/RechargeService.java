package com.acc.service;

import java.util.ArrayList;
import java.util.List;

import com.acc.bo.Rechargebo;
import com.acc.dao.RechargeDao;
import com.acc.dto.Rechargedto;


public class RechargeService {
	private RechargeDao dao;
  public RechargeService(RechargeDao dao){
	  this.dao=dao;
  }
  public List<Rechargedto> rechargehistory(Rechargebo rechargebo){
	  List<Rechargedto> list=new ArrayList<Rechargedto>();
	  List<Rechargebo> bos=dao.rechargeHistory(rechargebo);
	  for(Rechargebo bo : bos){
	    Rechargedto rdto=new Rechargedto();
	    rdto.setAmount(bo.getAmount());
	    rdto.setDate(bo.getDate());
	    rdto.setMobile(bo.getMobile());
	    rdto.setProvider(bo.getProvider());
	    rdto.setRechargeno(bo.getRechargeno());
	    list.add(rdto);
	  }
	  return list;
  }
}

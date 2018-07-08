package com.acc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.acc.bo.Rechargebo;
import com.acc.command.RechargeCommand;
import com.acc.dto.Rechargedto;
import com.acc.service.RechargeService;


public class RechargeController extends AbstractCommandController{
     private RechargeService service;
     
	public RechargeService getService() {
		return service;
	}

	public void setService(RechargeService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object object, BindException bindException)
			throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        
		RechargeCommand command=(RechargeCommand) object;
		Rechargebo rechargebo=new Rechargebo();
		rechargebo.setRechargeno(command.getRechargeno());
		rechargebo.setMobile(command.getMobile());
           List<Rechargedto> dto=service.rechargehistory(rechargebo);
        modelAndView.addObject("histories",dto);
        modelAndView.setViewName("result");
		return modelAndView;
	}

	
	
	
	
	
	
	
	
	
}

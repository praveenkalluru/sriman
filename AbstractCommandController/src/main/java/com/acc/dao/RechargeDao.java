package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.acc.bo.Rechargebo;
import com.acc.command.RechargeCommand;



public class RechargeDao {
	private String rechargeno;
	private String mobile=null;;
	public String RECHARGE_HISTORY="select * from recharge where mobile=";
	public JdbcTemplate jdbcTemplate;
	
    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Rechargebo> rechargeHistory(Rechargebo rechargebo){
		mobile=rechargebo.getMobile();
		RECHARGE_HISTORY=RECHARGE_HISTORY+mobile;
		System.out.println("mobile in dao ="+mobile);
		System.out.println(RECHARGE_HISTORY);
		rechargeno=rechargebo.getRechargeno();
       List<Rechargebo> rboss=jdbcTemplate.query(RECHARGE_HISTORY,new ResultSetExtractor<List<Rechargebo>>(){
		public List<Rechargebo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Rechargebo> rbos=new ArrayList<Rechargebo>();
			while(rs.next()){
				Rechargebo bo=new Rechargebo();
				bo.setRechargeno(rs.getString(1));
				bo.setProvider(rs.getString(2));
				bo.setDate(rs.getDate(3));
				bo.setAmount(rs.getFloat(4));
			    bo.setMobile(rs.getString(5));
				rbos.add(bo);
			}
			System.out.println("in dao ="+rbos);
			return rbos;
		}
       });
       RECHARGE_HISTORY=null;
       return rboss;
    }
}

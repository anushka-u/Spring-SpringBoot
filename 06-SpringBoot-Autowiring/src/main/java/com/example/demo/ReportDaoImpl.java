package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository//("reportDao")
public class ReportDaoImpl implements ReportDao {
	
	public ReportDaoImpl() {
		System.out.println("ReportDaoImpl::Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching reort data from db ....");
		return "Report Data";
	}
	
	

}

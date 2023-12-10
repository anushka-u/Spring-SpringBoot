package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository//("MySql")
public class MySqlReportDao implements ReportDao {

	@Autowired
	public MySqlReportDao() {
		System.out.println("MySqlReportDao :: Constructor");
	}
	
	@Override
	public String findData() {
		System.out.println("fetching reort data from MySql db ....");
		return "Report Data";
	}
	

}

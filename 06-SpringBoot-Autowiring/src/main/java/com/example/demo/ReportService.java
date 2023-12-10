package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	private ReportDao reportDao;
	
//	//Setter Method
//	@Autowired
////	@Qualifier("MySql")
//	//@Qualifier("reportDao")
//	public void setReportDao(ReportDao reportDao)
//	{
//		System.out.println("Set Report Dao method got called");
//		this.reportDao = reportDao;
//	}
	

	//Autowiring Using Constructor Injection
	public ReportService() {
		System.out.println("ReportService :: Zero Param Constructor");
	}
	
	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: ParamConstructor called");
		this.reportDao  = reportDao;
		
	}
	//Method to generate report
	public void generateReport() {
		String findData = reportDao.findData();
		System.out.println("Generating Reports");
	}
	
}

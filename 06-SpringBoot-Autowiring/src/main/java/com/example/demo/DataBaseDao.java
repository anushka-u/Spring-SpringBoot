package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class DataBaseDao implements ReportDao {
	
	public DataBaseDao()
	{
		System.out.println("Database Dao:: Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching data from Database db ...");
		return "Report Data";
	}
	

}

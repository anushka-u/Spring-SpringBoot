package com.springboot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String phNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phNumber=" + phNumber + "]";
	}
	
	
}

package edu.kh.inheritance.model.vo;

public class Employee extends Person {

	// 필드
	//private String name;
	//private int age;
	//private String nationality;
	private String company;
	
	// 기본 생성자
	public Employee() {}
	
	// 매개변수 생성자
	public Employee(String name, int age, String nationality, String company) {
		
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		this.company = company;
	}
	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	*/
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}


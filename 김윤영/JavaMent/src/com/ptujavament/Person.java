package com.ptujavament;

public class Person {

	private String id;
	private String pw;
	private String personName;
	private int age;
	private String gender;
	private String address;

	public Person(String id, String pw, String personName, int age, String gender, String address) {
		this.id = id;
		this.pw = pw;
		this.personName = personName;
		this.age = age;
		this.gender = gender;
		this.address = address;

	}

	public String getID() {
		return id;
	}

	public String getPW() {
		return pw;
	}

	public String getPersonName() {
		return personName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

}

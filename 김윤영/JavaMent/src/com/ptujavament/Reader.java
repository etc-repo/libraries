package com.ptujavament;

import java.util.List;

public class Reader extends Person {

	List<Book> checkOutBooksList;
	private boolean MeberStatus;

	public Reader(String id, String pw, String personName, int age, String gender, String address, boolean memberStat) {
		super(id, pw, personName, age, gender, address);
		setMeberStatus(memberStat);
	}

	public void setMeberStatus(boolean memberStatus) {
		this.MeberStatus = memberStatus;
	}

	public boolean getMeberStatus() {
		return this.MeberStatus;
	}

	public void printReader() {
		System.out.print("[");
		System.out.print(getPersonName() + " ");
		System.out.print(getAge() + " ");
		System.out.print(getGender() + " ");
		System.out.print(getAddress() + " ");
		System.out.print(getMeberStatus());
		System.out.println("]");
	}

	public void borrowed(Book book) {
	}

	public void turnIn(Book book) {

	}

}

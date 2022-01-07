package com.pojo;

public class Student {

	
	private int id ;
	private String Name;
	
	private String address;
	private long Phno;
	
	
	
	
	
	
	public Student(int id, String name, String address, long phno) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
		Phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", address=" + address + ", Phno=" + Phno + "]";
	}
	
	
	
	
	
}

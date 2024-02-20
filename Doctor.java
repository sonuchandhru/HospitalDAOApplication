package com.hospital.dao;

public class Doctor {
	private String name,specialization;
	private int id;
	public Doctor(int id,String name,String specialization){
	 this.id=id;
	 this.name=name;
	 this.specialization=specialization;
	}
	String getname(){
	 return name;
	}
	String getspecialization(){
	 return specialization;
	}
	int getid(){
	 return id;
	}

}

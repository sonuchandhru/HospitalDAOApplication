package com.hospital.dao;

public class Hospitalfactory {
	public Hospitalinterface createinstance(){
		 return new Hospital();
		 }
}

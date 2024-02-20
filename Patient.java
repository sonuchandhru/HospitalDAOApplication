package com.hospital.dao;

public class Patient {
	private String pname,contact,medicalhistory,dname;
	private int id,amount;
	Patient(int id,String pname,String dname,String contact,String medicalhistory,int amount){
	 this.id=id;
	 this.pname=pname;
	 this.dname=dname;
	 this.contact=contact;
	 this.medicalhistory=medicalhistory;
	 this.amount=amount;
	}
	int getid(){
	 return id;
	}
	String getpname(){
	 return pname;
	}
	String getcontact(){
	 return contact;
	}
	String getmedicalhistory(){
	 return medicalhistory;
	}
	String getdname(){
	 return dname;
	}
	int getamount(){
	 return amount;
	}

}

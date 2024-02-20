package com.hospital.dao;

public class Appointment {
	private int appointmentid,amount;
	private String doctor,patient,date,time,ch;
	Appointment(int appointmentid,String doctor,String patient,String date,String time,String ch,int amount){
	 this.appointmentid=appointmentid;
	 this.doctor=doctor;
	 this.patient=patient;
	 this.date=date;
	 this.time=time;
	 this.ch=ch;
	 this.amount=amount;
	}
	int getappointmentid(){
	 return appointmentid;
	}
	String getdoctor(){
	 return doctor;
	}
	String getpatient(){
	 return patient;
	}
	String getdate(){
	 return date;
	}
	String gettime(){
	 return time;
	}
	String get(){
	 return ch;
	}
	int getamount(){
	 return amount;
	}

}

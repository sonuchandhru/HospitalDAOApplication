package com.hospital.dao;

import java.util.Scanner;

public class Hospitalmanagement {
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to Hospital");
	 Hospitalfactory hf=new Hospitalfactory();
	 Hospitalinterface h=hf.createinstance();
	 int ch=1;
	 while(true){
	 while (ch>0&&ch<7)
	 {
	 h.choice();
	 ch=sc.nextInt();
	 switch(ch){
	 case 1: {
	 h.registerpatient();
	 break;
	 }
	 case 2: {
	 h.scheduleappointment();
	 break;
	 }
	 case 3: {
	 h.patientlist();
	 break;
	 }
	 case 4: {
	 h.doctorlist();
	 break;
	 }
	 case 5: {
	 h.appointmentlist();
	
	 break;
	 }
	 case 6: {
	 h.bill();
	 break;
	 }
	 }
	 }
	 break;
	 }
	 }

}

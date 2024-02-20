package com.hospital.dao;

import java.util.*;

public class Hospital implements Hospitalinterface {

	List<Patient> p=new ArrayList<>();
	List<Doctor> d=new ArrayList<>();
	List<Appointment> a=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public Hospital(){
	d.add(new Doctor(01,"John ","Cardilogist"));
	d.add(new Doctor(02,"Vishwas ","Dermatologist"));
	d.add(new Doctor(03,"Suhas ","Diabetologist"));
	d.add(new Doctor(04,"Raj ","Gynecologist"));
	d.add(new Doctor(05,"Suchin ","Neurologist"));
	d.add(new Doctor(06,"Shilpa ","Dietitian"));
	d.add(new Doctor(07,"Siddarth","Physiotherapist"));
	}
	public void registerpatient(){
	 String c,n,h=null,dname=null;
	 int m,amount=0,dupid=0;
	 System.out.println("Enter the Patient ID");
	 int id=sc.nextInt();
	 for (Patient p1:p)
	 {
	 if (p1.getid()==id)
	 {
	 System.out.println("Patient is already registered, Please enter other Patient id");
	 dupid=1;
	 break;
	 }
	 }
	 if(dupid==0){
	 System.out.println("Enter the Patient Name");
	 n=sc.next();
	 System.out.println("Enter the contact Number");
	 c=sc.next();
	 System.out.println("Enter the patient's medical condition");
	 System.out.println("1. Heart Pain");
	 System.out.println("2. Skin,hair or nail Disorders");
	 System.out.println("3. Diabetes");
	 System.out.println("4. Women's Health Issues");
	 System.out.println("5. Neuro Disorders");
	 System.out.println("6. Health issues regarding to food");
	 System.out.println("7. Any physical body pain");
	 m=sc.nextInt();
	 switch(m){
	 case 1: {
	 h="Cardiology";
	 dname="John";
	 amount=2000;
	 break;
	 }
	 case 2: {
	 h="Dermatology";
	 dname="Vishwas";
	 amount=2500;
	 break;
	 }
	 case 3: {
	 h="Diabetology";
	 dname="Suhas";
	 amount=1800;
	 break;
	 }
	 case 4: {
	 h="Gynecology";
	 dname="Raj";
	 amount=4000;
	 break;
	 }
	 case 5: {
	 h="Neurology";
	 dname="Suchin";
	 amount=3000;
	 break;
	 }
	 case 6: {
	 h="Diet";
	 dname="Shilpa";
	 amount=1500;
	 break;
	 }
	 case 7: {
	 h="Physiotherapy";
	 dname="Siddarth";
	 amount=5000;
	 break;
	 }
	 }
	 p.add(new Patient(id,n,dname,c,h,amount));
	 System.out.println("Patient Registered Successfully");
	
	 }
	}
	public void scheduleappointment(){
	 String dname=null,pname=null,ch=null,date=null,time=null;
	 int amount=0,duid=0,du=1,m=0;
	 System.out.println("Enter Appointment ID");
	 int appointmentid=sc.nextInt();
	 for (Appointment a1:a)
	 {
	 if (a1.getappointmentid()==appointmentid)
	 {
	 System.out.println("Appointment is already scheduled with this Id, Please enter other oppointment id");
	 duid=1;
	 break;
	 }
	 }
	 if (duid==0)
	 {
	 System.out.println("Enter the patient ID");
	 int ab=sc.nextInt();
	 for (Patient p1:p){
	 if (p1.getid()==ab)
	 {
	 dname=p1.getdname();
	 pname=p1.getpname();
	 amount=p1.getamount();
	 System.out.println("Enter the date of appointment required");
	 date=sc.next();
	 System.out.println("Enter the time of appointment required");
	 time=sc.next();
	 System.out.println("Please select the choice\n 1.AM\n 2.PM");
	 int c=sc.nextInt();
	 if (c==1)
	 {
	 ch="AM";
	 }
	 else{
	 ch="PM";
	 }
	 m=1;
	 }
	 }
	 if (m!=1)
	 {
	 System.out.println("Patient/Doctor not found, Kindly register patient before scheduling your appointment");
	 }
	 else
	 {
	 a.add(new Appointment(appointmentid,dname,pname,date,time,ch,amount));
	 System.out.println("Appointment scheduled successfully");
	 }}
	}
	public void choice(){
	 System.out.println();
	 System.out.println("Enter your choice");
	 System.out.println("1. Register patient");
	 System.out.println("2. Schedule appointment");
	 System.out.println("3. Display Patient list");
	 System.out.println("4. Display Doctors list");
	 System.out.println("5. Display Scheduled appointment list");
	 System.out.println("6. Generate bill");
	 System.out.println("7. Exit");
	}
	public void patientlist(){
	 System.out.println();
	 System.out.println("ID PatientName Contact MedicalHistory");
	 for (Patient p1:p)
	 {
	 if(p1!=null){
	 System.out.println(p1.getid()+" "+p1.getpname()+" "+p1.getcontact()+" "+p1.getmedicalhistory());
	 }
	 }
	}
	public void doctorlist(){
	 System.out.println();
	 System.out.println("ID DoctorName Specialization");
	 for (Doctor d1:d)
	 {
	 if(d1!=null){
	 System.out.println(d1.getid()+" "+d1.getname()+" "+d1.getspecialization());
	 }
	 }
	
	}
	public void appointmentlist(){
	 System.out.println();
	 System.out.println("ID DoctorName PatientName Date Time");
	 for (Appointment a1:a)
	 {
	 if (a1!=null)
	 {
	 System.out.println(a1.getappointmentid()+" "+a1.getdoctor()+" "+a1.getpatient()+""+a1.getdate()+" "+a1.gettime()+" "+a1.get());
	 }
	 }
	}
	public void bill(){
	 System.out.println("Enter the Appointment id");
	 int pi=sc.nextInt();
	 int amt=0,am=500;
	 for (Appointment a2:a)
	 {
	 if (a2.getappointmentid()==pi)
	 {
	 amt=amt+a2.getamount();
	 System.out.println();
	 System.out.println("=======================");
	 System.out.println("Bill Generated Successfully");
	 System.out.println("Service charge is : Rs."+amt);
	 System.out.println();
	 System.out.println("Doctor Charge is : Rs."+am);
	 double cost=amt+am;
	 System.out.println();
	 System.out.println();
	 System.out.println("Total amount is : Rs."+cost);
	 double Gst=(0.18*cost);
	 System.out.println("IGST 18% : Rs."+Gst);
	 System.out.println();
	 System.out.println();
	 System.out.println("Total Final Amount to be paid is : Rs."+(cost+Gst));
	 System.out.println("========Thankyou=======");
	 break;
	 }
	 }
	 if (amt==0)
	 {
	 System.out.println("Patient/Doctor not found");
	 System.out.println("========Thankyou=======");
	 }
	 }


}

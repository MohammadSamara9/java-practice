package employee;


import java.util.*;

public class Employeee {
	private int departmentNo;
	private String nameString;
	private long id;
	private Date birthDate;
	private Date hireDate;
	private double basicSalaray;
	
	
	public Employeee() {
		
	}
	
	
   public Employeee(int departmentNo,String nameString,long id,Date birthDate,Date hireDate,double basicSalaray) {
		this.departmentNo=departmentNo;
		this.nameString=nameString;
		this.id=id;
		this.birthDate=birthDate;
		this.hireDate=hireDate;
		this.basicSalaray=basicSalaray;
	}


   public int getDepartmentNo() {
	return departmentNo;
   }


   public void setDepartmentNo(int departmentNo) {
	this.departmentNo = departmentNo;
   }


   public String getNameString() {
	return nameString;
   }


   public void setNameString(String nameString) {
	this.nameString = nameString;
   }


   public long getId() {
	return id;
   }


   public void setId(long id) {
	this.id = id;
   }


   public Date getBirthDate() {
	return birthDate;
   }





   public Date getHireDate() {
	return hireDate;
   }





   public double getBasicSalaray() {
	return basicSalaray;
   }

   
   public void printInfo() {
	   System.out.println("___________________");
	   System.out.println("departmentNo:" +departmentNo);
	   System.out.println("nameString:" +nameString);
	   System.out.println("id:" +id);
	   System.out.println("birthDate:" +birthDate.toString());
	   System.out.println("hireDate:" +hireDate.toString());
	   System.out.println("basicSalaray:" +basicSalaray);
	   System.out.println("____________________");
	   
   }
	
	
	
	
	

   
   
	

}

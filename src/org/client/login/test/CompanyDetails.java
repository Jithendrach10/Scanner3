package org.client.login.test;

import java.util.Scanner;

public class CompanyDetails {
   private void companyName() {
       System.out.println("Hcl");
       
}
   private void companyId() {
     System.out.println("hcl0110");

}
	private void companyAddress() {
	System.out.println("chennai, hyd, banglore");


	}
	public static void main(String[] args) {
		CompanyDetails obj1 = new CompanyDetails();
		obj1.companyName();
		obj1.companyId();
		obj1.companyAddress();
		
		EmployeeDetails obj2 = new EmployeeDetails();
		obj2.employeeName();
		obj2.employeeId();
		obj2.employeeAge();
		obj2.empAddress();
		
	     byte age=35;
		System.out.println(age);
		
		short year= 2022;
		System.out.println("current year: "+ year);
		
		int numbeer = 76890087;
		System.out.println(numbeer);
		
		long phones =98765321420l;
		System.out.println(phones);
		
		float salary2 =50000.345f;
		System.out.println(salary2);
		
		double inter = 7890898.8987898d;
		System.out.println(inter);
		
		char y ='n';
		System.out.println(y);
 
		boolean v = true;
		System.out.println(v);
		
		String o ="this is not correct";
		System.out.println(o);
		
		
		Scanner t = new Scanner(System.in);
		byte a = t.nextByte();
		System.out.println(a);
		
		short b = t.nextShort();
		System.out.println(b);
		
		int c = t.nextInt();
		System.out.println(c);
		
		long d = t.nextLong();
		System.out.println(d);
		
		float e = t.nextFloat();
		System.out.println(e);
		
		double f = t.nextDouble();
		System.out.println(f);
		
		boolean g = t.nextBoolean();
		System.out.println(g);
		
		String h = t.next();
		System.out.println(h);
		
		String i = t.nextLine();
		System.out.println(i);
  
		String j = t.nextLine();
		System.out.println(j);
		
	}

}

package edu.atria.java.oops;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		// creation of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee details..");
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		String designation = sc.next();

		/*
		 * eOne.setId(id); eOne.setName(name); eOne.setSalary(salary);
		 * eOne.setDesignation(designation); System.out.println(" the employee id is: "
		 * + eOne.getId()); System.out.println(" the employee name is: " +
		 * eOne.getName()); System.out.println(" the employee salary is: " +
		 * eOne.getSalary()); System.out.println(" the employee designation is: " +
		 * eOne.getDesignation());
		 */

		// className objname =new classname();
		// default constructor

		/*
		 * Employee eOne = new Employee(); System.out.println(eOne);
		 */

		// parameterized constructor
		Employee eTwo = new Employee(1000, "rash", 500000.00, "student"); // parameterized constructor
		System.out.println(eTwo);
	}
}

//in this program we have shown the working of classes, objects, encapsulation and scanner_class.
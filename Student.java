package com.masai;

import java.util.Scanner;

public class Student {
	
	int roll;
	String Name;
	int marks;
	
	Student(){}
	
	Student(int r,String n,int m){
		roll=r;
		Name=n;
		marks=m;
	}
	
	void displayStudentDetails() {
		System.out.println("Roll is:" + roll);
		System.out.println("Name is:" + Name);
		System.out.println("Marks is:" + marks);
			
		
}

	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sanyam",100);
		Student s2 = new Student(2,"Cosykiddo",200);
		s1.displayStudentDetails();
		System.out.println("---------------------");
		s2.displayStudentDetails();
		
		s1=null;
		s2=null;
		System.gc();
		
		
		
		

	
	}
}

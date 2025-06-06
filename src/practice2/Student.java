package practice2;

import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private int year_of_study=2024;
	
	
	public Student(String n, String i) {
		name=n;
		id=i;		
	}
	
	public String GetName(){
		return name;
	}
	
	public String GetId(){
		return id;
	}
	
	public int GetYear() {
		return year_of_study;
	}
	public void IncrementYear() {
	     year_of_study+=4;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=input.nextLine();
		
		System.out.println("Enter ID: ");
		String id=input.nextLine();
		
		Student student=new Student(name, id);
		 System.out.println("Student name: " + student.GetName());
	     System.out.println("Student ID: " + student.GetId());
	     System.out.println("Year of study: " + student.GetYear());
	     
	     student.IncrementYear();
	     System.out.println("Year of graduation: "+student.GetYear());
		
	    
	}

}


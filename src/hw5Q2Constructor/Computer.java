package hw5Q2Constructor;

public class Computer {
public String name;
public String model;
public int price;
public String operatingSystem;
public char grade;
public boolean madeinusa;
	
public Computer() { // default constructor.
	System.out.println("This default constructor is from Computer class");
	}
		
public Computer(String name, String model, int price, String operatingsystem, char grade, boolean madeinusa) { //  parameterized constructor.
	this.name = name;
	this.model = model;
	this.price= price;
	this.operatingSystem = operatingsystem;
	this.grade = grade;
	this.madeinusa = madeinusa;

System.out.println("My computer is: " + name + "\tMy Computer model is: " + model + "\tPrice is: " + price + "\toperatingsystem is: " +
		operatingSystem + "\tgrade is :" + grade + "\tMy Computer is made in USA :" + madeinusa);
		 
		
		
	}
	
	
	

		
		
		
		
	
	


	}

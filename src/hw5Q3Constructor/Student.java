package hw5Q3Constructor;

public class Student {
	
	
	public String stname;
	public int stID;
	public float grade;
	public char sex;
	public boolean isProgrammer;
	
	public Student() { 
	System.out.println("This is from default Constructor of student class");
		
	}

	public Student(String stname,int stID, float grade, char sex, boolean isProgrammer) {
		
		this.stname = stname;
		this.stID = stID;
		this.grade = grade;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		
		System.out.println("Student Name: " + stname + "\tStudent ID: " + stID + "\tStudent Grade: " + grade +"\tStudent Sex: "+sex + "\tProgrammer: "
				+ isProgrammer);
	}

	
}

	
	
		
	
		
	


		

	



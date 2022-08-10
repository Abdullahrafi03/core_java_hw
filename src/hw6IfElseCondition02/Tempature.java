package hw6IfElseCondition02;

import java.util.Scanner;

public class Tempature {
	public static void main(String[] args) {
		System.out.println("Today's Temperature");
		
		Scanner scanner = new Scanner(System.in);
		int Temperature = scanner.nextInt();
		if (Temperature < 32) {
			System.out.println("It will Be Freezing");
	
		}else if (Temperature < 55) {
			System.out.println("It will Be Pleasent");
		
		}else if (Temperature < 73) {
			System.out.println("It's getting Warmer");
		
		}else if (Temperature < 101) {
		    System.out.println("It is Very hot");
		
		}else {
			System.out.println("Put Ice on top of my Head Please");
		}
		scanner.close();
		
	    }
	}



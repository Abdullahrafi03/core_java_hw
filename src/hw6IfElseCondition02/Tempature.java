package hw6IfElseCondition02;

import java.util.Scanner;

public class Tempature {
	public static void main(String[] args) {
		System.out.println("Today's Temperature");
		
		Scanner scanner = new Scanner(System.in);
		int temperature = scanner.nextInt();
		if (temperature < 32) {
			System.out.println("It will Be Freezing");
	
		}else if (temperature < 55) {
			System.out.println("It will Be Pleasent");
		
		}else if (temperature < 73) {
			System.out.println("It's getting Warmer");
		
		}else if (temperature < 101) {
		    System.out.println("It is Very hot");
		
		}else {
			System.out.println("Put Ice on top of my Head Please");
		}
		scanner.close();
		
	    }
	}



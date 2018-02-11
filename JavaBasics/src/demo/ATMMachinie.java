package demo;

import java.util.Scanner;

public class ATMMachinie {
	
	public static void main(String[] args) {
		int correctPIN = 1234;
		System.out.println("Please enter your PIN - ");
		
		Scanner keyboard = new Scanner(System.in);
		int enterdPIN = keyboard.nextInt();
		
		while(enterdPIN != correctPIN){
			System.out.println("The PIN you enterd is incorrect.Please try again.");
			enterdPIN = keyboard.nextInt();
		}
		
		System.out.println("Welcome to ABC Bank");
		
		
	}

}

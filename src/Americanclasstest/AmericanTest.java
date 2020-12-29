package Americanclasstest;

import java.util.Scanner;

public class AmericanTest {
	  public static Scanner reader= new Scanner(System.in);

	private int[] correct;
	
	AmericanTest(int[] correct){
		for(int i=0;i<correct.length;i++) {
			System.out.println("enter correct answer between 1-4");
			correct[i]= reader.nextInt();
		}
	}
	
	 int grade(int[] studentTest) {
		int grade=0;
		for(int i=0;i<correct.length;i++) {
			if(correct[i]==studentTest[i]) {grade+=10;}}//assuming there are 10 answers
		return grade;
	}


}

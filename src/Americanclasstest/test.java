package Americanclasstest;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		int[] correct = new int[10];
		AmericanTest student= new AmericanTest(correct);
		for(int j=0;j<5;j++) {
			int[] studentTest=new int[10];
			for(int i=0;i<correct.length;i++) {
				studentTest[i]= reader.nextInt();
			}
			int check=student.grade(studentTest);
			if((int)(check)==100) {System.out.println("student "+j+ " is Excellent");}
		}
}
}

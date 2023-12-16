package com.grade.calculator;

import java.util.Scanner;

public class OneClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects:");
		int numSubjects = scanner.nextInt();
		
		double totalMarks = 0;
		
		
		
		for (int i = 1; i <= numSubjects; i++) {
			System.out.println("Enter marks obtained in subject" + i + ": ");
			int marks = scanner.nextInt();
			totalMarks += marks;
		}
		
		double averagePercentage = totalMarks / numSubjects;
		
		
		char grade;
		if (averagePercentage >=90) {
			grade = 'A';
		}else if(averagePercentage >= 80) {
			grade = 'B';
		}else if(averagePercentage >=70) {
			grade = 'C';
		}else if(averagePercentage >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("\t****Result****");
		System.out.println("Total Marks Obtained: " + totalMarks);
		System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
		System.out.println("Grade:" + grade);
		
		scanner.close();
		}

}

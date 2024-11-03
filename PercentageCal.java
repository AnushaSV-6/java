package com.company.java;

import java.util.Scanner;

public class PercentageCal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Declare variables for marks
        int subject1, subject2, subject3, subject4, subject5, subject6;


        System.out.print("Enter marks for subject 1: ");
        subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        subject3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        subject4 = scanner.nextInt();
        System.out.print("Enter marks for subject 5: ");
        subject5 = scanner.nextInt();
        System.out.print("Enter marks for subject 6: ");
        subject6 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
        double percentage = (double) totalMarks / 6;

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);


    }

}




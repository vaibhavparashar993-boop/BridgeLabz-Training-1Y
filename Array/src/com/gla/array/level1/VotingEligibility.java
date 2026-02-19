package com.gla.array.level1;

import java.util.Scanner;

class VotingEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++){
            System.out.println("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int age : ages){
            if (age < 0){
                System.out.println("Invalid age: " + age);
            } else if (age >= 8){
                System.out.println("Student with age " + age + " can vote.");
            } else {
                System.out.println("Student with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
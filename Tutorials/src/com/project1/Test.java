package com.project1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Find sum of prime numbers upto : ");
        int upto = scanner.nextInt();

        int sum = 0;

        for(int num = 2; num <= upto; num++) {

            int i;

            for(i = 2; i <= num; i++) {

                if(num % i == 0) {
                    i = num;
                    break;
                }
            }

            // If the number is prime then add it.
            if(i != num) {
                sum += num;            
            }
        }

        System.out.println("\nSum of all prime numbers upto " + upto + " : " + sum);
    }

}
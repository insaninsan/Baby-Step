package org.example;

// this code aim is to help you:)
// A perfect number is the sum of its exact divisors.
public class Main {
    public static void main(String[] args) {

        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;

            }
            
        }
        if (total == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
package org.codingPractice.primeno;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int n = sc.nextInt();
        Main ob = new Main();
        ob.check(n);
    }

    void check(int n) {
        if (n < 0)
            System.out.println("Please enter a positive integer");
        else
            prime(n);
    }

    void prime(int n) {
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                ++c;
        }
        if (c >= 1)
            System.out.println("Entered number is not a prime number");
        else
            System.out.println("Entered number is a prime number");
    }
}

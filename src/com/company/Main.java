package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
/*        if (x > 0) {
            if (x < 10) {
                System.out.println("positive single digit number.");
            }
        }*/
        if (x < 10 && x > 0) {
            System.out.println("positive single digit number.");
        }
    }
}

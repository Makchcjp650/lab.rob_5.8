package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (( 50<a ) & ( a < 100 )) {
            System.out.println("Число " + a + " міститься на проміжку");
        } else {
            System.out.println("Число " + a + " не міститься на проміжку");
        }

        }
    }

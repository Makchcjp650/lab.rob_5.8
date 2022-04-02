package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 10;
        int b = (n % 100 - a) / 10;
        n = ( n - a - b * 10) / 100;
        int z = Math.max( n , b);
        System.out.println(Math.max( z , b ));
        }
    }


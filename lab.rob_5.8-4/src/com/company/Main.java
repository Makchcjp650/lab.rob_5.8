package com.company;

public class Main {

    public static void main(String[] args) {
        String a = "-";
        switch (a) {
            case "Так":
            case "Yes":
            case "OK":
            case "Y":
            case "Ok":
            case "+":
                System.out.println("Я погоджуюсь ");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "No":
            case "-":
                System.out.println("Я відмовляюсь ");
                break;
            default: System.out.println("Ви ввели не існуючі дані");
        }
    }
}

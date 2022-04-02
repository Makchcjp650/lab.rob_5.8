package com.company;

public class Main {

    public static void main(String[] args) {
        int floor = 2;
        String down = " down ";
        String down1 = " down ";
        String up = " up ";
        if ((0 < floor) & (floor < 10)) {
            if (down.equals(up)){
                if (floor == 2) {
                    System.out.println("you up on 3 floor");
                } else System.out.println("you up on " + floor + " floor");
            } else if (down.equals(down1)) {
                if (floor == 2){
                    System.out.println("you down on 1 floor");
                } else System.out.println("you down on " + floor + " floor");
            }else System.out.print("unknown line");
        }else System.out.println("unknown floor");
    }
}

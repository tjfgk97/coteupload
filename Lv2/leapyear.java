package Lv2;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

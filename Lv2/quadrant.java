package Lv2;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}

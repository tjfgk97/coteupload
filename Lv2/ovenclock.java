package Lv2;

import java.util.Scanner;

public class ovenclock {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        if (B + C >= 60) {

            A = A + ((B + C) / 60);
            if (A >= 24) {
                A = A - 24;
            }

            System.out.println(A + " " + (B + C) % 60);

        } else {
            
            System.out.println(A + " " + (B + C));
        }
    }
}

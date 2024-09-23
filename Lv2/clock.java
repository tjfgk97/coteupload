package Lv2;

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int H = scn.nextInt();
        int M = scn.nextInt();

        if (M < 45) {
            if (H == 0) {
                System.out.print(H + 23 + " ");
            } else {
                H--;
                System.out.print(H + " ");
            }
            System.out.println(60 - (45 - M));
        } else {
            System.out.print(H + " ");
            System.out.println(M - 45);
        }
    }
}

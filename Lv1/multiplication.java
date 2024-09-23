package Lv1;

import java.util.Scanner;

public class multiplication {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("세 자리의 정수를 두 개 입력하세요.");
        int a = scn.nextInt();
        String str = scn.next();

        char a0 = str.charAt(0);
        char a1 = str.charAt(1);
        char a2 = str.charAt(2);
        System.out.println(a * Character.getNumericValue(a2));
        System.out.println(a * Character.getNumericValue(a1));
        System.out.println(a * Character.getNumericValue(a0));
        System.out.println(a * Integer.parseInt(str));

    }

}

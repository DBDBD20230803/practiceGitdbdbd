package com.dbdbd;

import java.util.Scanner;

public class Calsub {
    public static void calSub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력해주세요.");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("값을 입력해 주세요.");
        int num2 = Integer.parseInt(sc.nextLine());

        int minus = num1 - num2 ;

        System.out.println("num1 - num2 : " + minus);
    }
}
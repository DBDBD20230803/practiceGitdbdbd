package com.dbdbd;

import java.util.Scanner;

public class Calsub {
    public static void calSub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<2. 빼기>");
        System.out.print("첫번째 정수를 입력해주세요. ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 정수를 입력해주세요. ");
        int num2 = Integer.parseInt(sc.nextLine());
        int minus = num1 - num2 ;
        System.out.println( num1 + " - " + num2 + " = " + minus);
    }
}
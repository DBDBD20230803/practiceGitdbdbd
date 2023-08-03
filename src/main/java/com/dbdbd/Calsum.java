package com.dbdbd;

import java.util.Scanner;

public class Calsum {
    public static void calSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<1. 더하기>");
        System.out.print("첫번째 정수를 입력해주세요. ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요. ");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println( num1 + " + " + num2 + " = " + result);
    }
}

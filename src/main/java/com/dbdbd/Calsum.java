package com.dbdbd;

import java.util.Scanner;

public class Calsum {
    public static void calSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("결과 값: " + result);
    }
}

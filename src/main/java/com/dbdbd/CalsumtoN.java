package com.dbdbd;

import java.util.Scanner;

public class CalsumtoN {
    public static void calSumtoN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<6. 1 ~ n 더하기>");
        System.out.println("1 부터 n 까지의 정수 값을 합을 구합니다.");
        System.out.print("n 의 값을 입력해주세요. ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지 합의 값은 " + sum + "입니다.");
    }
}
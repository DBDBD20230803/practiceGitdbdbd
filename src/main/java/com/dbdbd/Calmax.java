package com.dbdbd;

import java.util.Scanner;
public class Calmax {

    public static void calMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<9. 최대값>");
        System.out.print("첫번째 숫자를 입력해주세요 ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("두번째 숫자를 입력해주세요. ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("값이 더 큰 수는 " + Math.max(a, b) + "입니다.");
    }
}

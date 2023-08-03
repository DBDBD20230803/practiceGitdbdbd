package com.dbdbd;

import java.util.Scanner;

public class Calmax {

    public static void calMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.max(a, b));
    }
}

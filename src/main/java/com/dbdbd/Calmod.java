package com.dbdbd;

import java.util.Scanner;

public class Calmod {
    public static void calMod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = Integer.parseInt(scanner.nextLine());
        int remainder =  a % b;
        System.out.println(remainder);
    }
}

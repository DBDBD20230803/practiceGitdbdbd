package com.dbdbd;

import java.util.Scanner;

public class Caldiv {
    public static void calDiv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요.");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("두번째 숫자를 입력해주세요.");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println(a + " / " + b + " = "+ a/b);
    }
}

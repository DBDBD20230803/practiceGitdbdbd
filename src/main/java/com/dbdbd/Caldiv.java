package com.dbdbd;

import java.util.Scanner;

public class Caldiv {
    public static void calDiv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<3. 나누기>");
        System.out.print("첫번째 정수를 입력해주세요. ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("두번째 정수를 입력해주세요. ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println(a + " / " + b + " = "+ a/b);
    }
}

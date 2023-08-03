package com.dbdbd;

import java.util.Scanner;

public class Calmin {

    public static void calMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<최소값 비교>");
        System.out.print("첫번째 숫자를 입력해주세요.");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("두번째 숫자를 입력해주세요.");
        int b = sc.nextInt();
        sc.nextLine();
        int c = Math.min(a, b);
        System.out.println(c + "가 더 작습니다.");
    }
}

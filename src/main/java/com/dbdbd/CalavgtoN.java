package com.dbdbd;

import java.util.Scanner;

public class CalavgtoN {
    public static void calAvgtoN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요.");
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int ave = sum / n;

        System.out.println(ave);
    }
    }

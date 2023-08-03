package com.dbdbd;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========== 계 산 기 ==========");
            System.out.println("<1. 더하기>");
            System.out.println("<2. 빼기>");
            System.out.println("<3. 나누기>");
            System.out.println("<5. mod>");
            System.out.println("<6. 1 ~ n 더하기>");
            System.out.println("<8. 1 ~ n 평균값 구하기>");
            System.out.println("<9. 최대값>");
            System.out.println("<10. 최소값>");
            System.out.println("<0. 종료>");
            int no = sc.nextInt();

            /* class명과 method명 대소문자 유의해서 작성 부탁드립니다. */
            /* class를 따로 생성해서 그 class 내에 맡으신 method 작성 부탁드립니다. */

            switch(no) {
                case 1: Calsum.calSum(); break;
                case 2: Calsub.calSub(); break;
                case 3: Caldiv.calDiv(); break;
                case 5: Calmod.calMod(); break;
                case 6: CalsumtoN.calSumtoN(); break;
                case 8: CalavgtoN.calAvgtoN(); break;
                case 9: Calmax.calMax(); break;
                case 10: Calmin.calMin(); break;
                case 0: System.out.println("프로그램을 종료합니다."); return;

            }
        } while(true);
    }
}

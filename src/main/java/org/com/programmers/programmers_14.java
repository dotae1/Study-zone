package org.com.programmers;

import java.util.Scanner;

public class programmers_14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("피보나치 수를 구할 정수를 입력하세요 : ");
        int n = scr.nextInt();

        int[] fibo = new int[n + 1]; // 배열 크기 n+1로 설정
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567; // 큰 수 방지
        }

        System.out.println("피보나치 수는 " + fibo[n] + "입니다.");
    }
}

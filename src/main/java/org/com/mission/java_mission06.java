package org.com.mission;

import java.util.Scanner;

public class java_mission06 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("두 개의 정수를 입력하세요 : ");
        int a = scr.nextInt();
        int b = scr.nextInt();

        scr.close();

        int answer1 = plus(a, b);
        int min = minus(a, b);

        System.out.println("덧셈 결과 : " + answer1);
        System.out.println("뺄셈 결과 : " + min);


    }
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
}

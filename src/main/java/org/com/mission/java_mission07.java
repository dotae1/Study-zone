package org.com.mission;

import java.util.Scanner;

public class java_mission07 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("직사각형 가로와 세로를 입력하세요 : ");
        int a = scr.nextInt();
        int b = scr.nextInt();

        int result = a*b;
        System.out.println("직사각형의 넓이는 : " + result + "입니다.");
    }
}

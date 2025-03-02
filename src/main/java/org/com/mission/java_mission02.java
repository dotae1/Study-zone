package org.com.mission;
import java.util.Scanner;

public class java_mission02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = scr.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = scr.nextInt();

        if(a>b){
            System.out.println("더 큰 정수는 " + a + " 입니다.");
        } else if(b>a){
            System.out.println("더 큰 정수는 " + b + " 입니다.");
        } else {
            System.out.println("두 수는 값이 같습니다.");
        }


    }
}

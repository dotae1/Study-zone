package org.com.javamiddlemission;

import org.com.javamiddlemission.square1.Calculator;

import java.util.Scanner;

public class java_mission12 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = scr.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = scr.nextInt();
        System.out.print("연산하고자 하는 문자를 입력해주세요 : ");
        String str = scr.next();

        Calculator.Sum sum = (x, y)-> a+b;
        Calculator.Min min = (x , y) -> a-b;
        Calculator.Mul mul = (x , y) -> a*b;
        Calculator.Div div = (x , y) -> a/b;

        switch(str) {
            case "+":
                System.out.println(sum.sum(a, b)); break;
            case "-" :
                System.out.println(min.min(a, b));break;
                case "*":
                    System.out.println(mul.mul(a,b));break;
                    case "/":
                        System.out.println(div.div(a, b));break;
        }




    }
}

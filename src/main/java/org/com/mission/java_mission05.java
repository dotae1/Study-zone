package org.com.mission;
import java.util.Arrays;
import java.util.Scanner;
public class java_mission05 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] num1 = new int[5];

        System.out.println("5개의 정수를 입력해주세요 : ");
        for(int i=0;i<5;i++){
            num1[i] = scr.nextInt();
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));


    }
}

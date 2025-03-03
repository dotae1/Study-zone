package org.com.mission;
import java.util.Arrays;
import java.util.Scanner;

public class java_mission08 {
    public static void main(String[] args) {
        int[] num = {5, 5, 5, 5, 5};
        double sum = 0;  // 정수형에서 실수형으로 변경

        // 배열 평균 계산
        for (int k : num) {
            sum += k;
        }
        double average = sum / num.length;  // 실수 나눗셈으로 평균 계산
        System.out.println("배열의 평균은 : " + average);

        // 배열 값 변경
        Scanner scr = new Scanner(System.in);
        System.out.println("배열을 바꿀 숫자 " + num.length + "개를 입력하세요 : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scr.nextInt();
        }
        scr.close();  // Scanner 닫기

        Arrays.sort(num); //배열 오름차순 정렬

        // 변경된 배열 출력
        System.out.print("변경된 배열: ");
        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}

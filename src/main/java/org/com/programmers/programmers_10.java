package org.com.programmers;

import java.util.Arrays;

public class programmers_10 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2},
                {3,4}
        };
        int[][] arr2 = {
                {3,4},
                {4,5}

        };

        int rows = arr1.length;        // 행 개수
        int cols = arr1[0].length;     // 열 개수

        int[][] answer = new int[rows][cols]; // 정답 배열 초기화

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j]; // 배열 요소 더하기
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(answer[i])); // 한 행을 문자열로 출력
        }
    }

}

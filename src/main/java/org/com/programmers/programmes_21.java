package org.com.programmers;

public class programmes_21 {
    public static void main(String[] args) {
        int[][] sizes = {
                {30, 40},
                {50, 70},
                {60, 90},
                {100, 30}
        };
        int maxWidth = 0;  // 최대 가로 길이
        int maxHeight = 0; // 최대 세로 길이

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);  // 더 큰 값을 가로로
            int height = Math.min(size[0], size[1]); // 더 작은 값을 세로로

            maxWidth = Math.max(maxWidth, width);   // 전체 명함 중 최대 가로
            maxHeight = Math.max(maxHeight, height); // 전체 명함 중 최대 세로
        }

        System.out.println(maxWidth * maxHeight); // 최소 크기의 지갑
    }
}

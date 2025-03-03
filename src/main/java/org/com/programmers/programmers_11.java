package org.com.programmers;

import java.util.Arrays;

public class programmers_11 {
    public static void main(String[] args) {

        String s = "abcdeFG";
        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();

        // 배열을 내림차순으로 정렬 (대문자는 소문자보다 먼저 정렬)
        Arrays.sort(charArray); //Arrays.sort는 기본적으로 오름차순 정렬

        // 정렬된 배열을 문자열로 변환하여 반환 (내림차순을 위해 reverse로 배열 뒤집기)
        StringBuilder result = new StringBuilder(new String(charArray));
        System.out.print(result.reverse().toString()); // 뒤집어서 내림차순 문자열 반환
    }
}

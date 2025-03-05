package org.com.programmers;

import java.util.Arrays;

public class programmers_16 {
    public static void main(String[] args) {

        long n = 125435905;
        // 숫자를 문자열로 변환 후 문자 배열로 변환
        char[] digits = String.valueOf(n).toCharArray();

        // 내림차순 정렬
        Arrays.sort(digits);
        StringBuilder sortedNumber = new StringBuilder(new String(digits)).reverse();

        // 정수로 변환하여 반환
        System.out.println(Long.parseLong(sortedNumber.toString()));
    }
}

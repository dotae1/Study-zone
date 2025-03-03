package org.com.programmers;

import java.util.*;

public class programmers_13 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String[] strArr = s.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        // 최소값과 최대값을 초기화
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // ArrayList에서 숫자들을 정수로 변환하고 최소, 최대값 찾기
        for (String numStr : list) {
            int num = Integer.parseInt(numStr);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // "(최소값) (최대값)" 형태로 리턴
        System.out.println( min + " " + max);
    }
}

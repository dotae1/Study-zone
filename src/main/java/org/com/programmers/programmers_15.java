package org.com.programmers;

import java.util.*;

public class programmers_15 {
    public static void main(String[] args) {
        String s = "banana";

        int[] answer = new int[s.length()]; // 결과 배열
        Map<Character, Integer> lastIndexMap = new HashMap<>(); // 문자별 마지막 위치 저장

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (lastIndexMap.containsKey(c)) {
                // 이전에 같은 문자가 나온 적이 있다면 거리 계산
                answer[i] = i - lastIndexMap.get(c);
            } else {
                // 처음 나온 문자면 -1 저장
                answer[i] = -1;
            }

            // 현재 문자의 위치를 업데이트
            lastIndexMap.put(c, i);
        }
        for(int i=0;i<answer.length;i++){
        System.out.print(answer[i] + " ");;
    }
    }
}
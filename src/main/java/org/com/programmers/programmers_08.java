package org.com.programmers;
import java.util.*;

public class programmers_08 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 9123;
        ArrayList<Integer> numList = new ArrayList<>();

        // 숫자의 각 자리수를 ArrayList에 저장
        while (n > 0) {
            numList.add(n % 10); // 마지막 자리 숫자를 추가
            n /= 10; // 마지막 자리 제거
        }

        // 저장된 숫자들을 모두 더하기
        for (int num : numList) {
            answer += num;
        }

        System.out.println(answer);
    }
}



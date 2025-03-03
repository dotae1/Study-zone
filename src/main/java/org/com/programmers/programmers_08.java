package org.com.programmers;

import java.util.*;

public class programmers_08 {
    public static void main(String args[]) {
        boolean answer = true;
        int co = 0;
        int co1 = 0;
        String s = "pyPPYy";


        // String을 char 배열로 변환
        char[] charArray = s.toCharArray();

        // for-each 문을 사용하여 char 배열을 순회
        for (char a : charArray) {
            if (a == 'p' || a == 'P') {  // 대소문자 처리 추가
                co += 1;
            } else if (a == 'y' || a == 'Y') {  // 대소문자 처리 추가
                co1 += 1;
            }
        }

        // p와 y의 개수 비교
        if (co == co1) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
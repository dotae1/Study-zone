package org.com.programmers;

import java.util.*;

public class programmers_18 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = {1,1,1,2,5};

        list.add(arr[0]); // 첫 번째 숫자는 무조건 추가
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 연속된 숫자가 다르면 추가
                list.add(arr[i]);
            }
        }

        // 리스트를 배열로 변환 (for문 사용)
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for (int j : answer) {
            System.out.print(j);
        }
    }
}

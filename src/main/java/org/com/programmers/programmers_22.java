package org.com.programmers;

public class programmers_22 {
    public static void main(String[] args) {

        String s = "ABC";
        int n = 3;


        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // 대문자 처리
                result.append((char) ('A' + (ch - 'A' + n) % 26));
            } else if (Character.isLowerCase(ch)) {
                // 소문자 처리
                result.append((char) ('a' + (ch - 'a' + n) % 26));
            } else {
                // 공백이나 기타 문자 그대로 추가
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
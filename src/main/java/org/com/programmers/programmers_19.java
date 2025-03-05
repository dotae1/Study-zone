package org.com.programmers;

public class programmers_19 {
    public static void main(String[] args) {

            int n = 125;

            // 1. 3진법 변환 (문자열 형태)
            String ternary = Integer.toString(n, 3);

            // 2. 문자열 뒤집기
            String reversed = new StringBuilder(ternary).reverse().toString();

            // 3. 10진법으로 변환 후 반환
            System.out.print(Integer.parseInt(reversed, 3));

        }
    }


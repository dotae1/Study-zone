package org.com.javamiddlemission;

import java.util.Scanner;

public class java_mission10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        // 문자열 뒤집기
        String reversed = new StringBuilder(input).reverse().toString();

        // 대소문자 변환
        String toggled = toggleCase(reversed);

        // 결과 출력
        System.out.println("뒤집은 문자열: " + reversed);
        System.out.println("대소문자 변환 문자열: " + toggled);

        scanner.close();
    }

    // 대소문자 변환 메서드
    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // 공백, 숫자, 특수문자는 그대로 유지
            }
        }
        return result.toString();
    }
}

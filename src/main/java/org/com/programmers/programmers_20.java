package org.com.programmers;

public class programmers_20 {
    public static void main(String[] args) {
        String s = "try hello wolrd";
        String answer = "";
        String[] ans = s.split(" ", -1); // 공백 유지

        for (int i = 0; i < ans.length; i++) {
            String a = ans[i]; // 개별 단어 가져오기
            StringBuilder modified = new StringBuilder();

            for (int j = 0; j < a.length(); j++) {
                if (j % 2 == 0) { // 짝수 번째 문자 → 대문자
                    modified.append(Character.toUpperCase(a.charAt(j)));
                } else { // 홀수 번째 문자 → 소문자
                    modified.append(Character.toLowerCase(a.charAt(j)));
                }
            }

            answer += modified.toString(); // 변환된 단어 추가
            if (i < ans.length - 1) {
                answer += " "; // 마지막 단어 뒤에는 공백 추가 X
            }
        }

        System.out.println(answer);
    }
}

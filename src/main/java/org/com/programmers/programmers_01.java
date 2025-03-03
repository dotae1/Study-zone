package org.com.programmers;

public class programmers_01 {
    public static void main(String[] args) {
        int answer = 0;
        String s = "-1234";
        char c = s.charAt(0);

        if(c == '-'){ //음수인지 양수인지 확인
            answer = Integer.parseInt(s);
        } else {
            answer = Integer.parseInt(s);
        }
        System.out.println(answer);

    }
}
/* 이게 조금 더 간단하긴 하지만 음수인지 양수인지 판별하는 코드는 들어가있지 않다.
public static void main(String[] args) {
  int answer = 0;
  answer = Integer.parseInt(s);
  System.out.println(answer);
 */

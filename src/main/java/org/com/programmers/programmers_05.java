package org.com.programmers;

public class programmers_05 {
    public static void main(String[] args) {
            boolean answer = true;
            int x = 10;
            int sum = 0;
            String str = Integer.toString(x); //x값을 String형식으로 변환

            for(int i=0;i<str.length();i++){
                char c = str.charAt(i); //String str의 하나하나 c에 저장
                sum += c -  '0'; // 문자 c는 - '0'을 하면 ASCII CODE값에 의해 원래 값으로 돌아옴
            }

            if(x%sum ==0){
                answer = true;
            }else {
                answer = false;
            }

            System.out.println(answer);
        }
    }




package org.com.programmers;

public class programmers_03 {
    public static void main(String[] args) {
        String s = "1234";
        boolean answer = true;
            int len = s.length();

            if(len==4 || len==6){
                for(int i=0;i<len;i++){
                    char c = s.charAt(i);
                    if((c>=65 && c<=90) || (c >=97 && c<=122)){
                        answer = false;
                        break;
                    }
                }
            } else {
                answer = false;
            }

        System.out.println(answer);
        }
    }

    /* 신박한 방법
    public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
     */


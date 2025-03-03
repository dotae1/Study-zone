package org.com.programmers;

public class programmers_04 {
    public static void main(String[] args) {
        int n=50;
        int answer = 0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}

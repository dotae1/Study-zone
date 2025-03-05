package org.com.programmers;

public class programmers_17 {
    public static void main(String[] args) {

        int[] a = {1, -1, 3};
        int[] b = {2, 0, 9};

        int answer = 0;
        int a1 = a.length;

        for(int i=0;i<a1;i++){
            answer += a[i] *b[i];
        }
        System.out.println(answer);
    }
}

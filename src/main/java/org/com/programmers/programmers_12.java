    package org.com.programmers;

    import java.util.Scanner;
    import java.util.Arrays;

    public class programmers_12 {
        public static void main(String[] args) {
            int[] answer = new int[2];
            Scanner scr = new Scanner(System.in);
            System.out.print("최대공약수, 최대공배수를 구할 두 정수를 입력하세요 : ");
            int n = scr.nextInt();
            int m = scr.nextInt();

            // 최대공약수(GCD) 계산 (유클리드 호제법)
            int gcd = getGCD(n, m);

            // 최소공배수(LCM) 계산
            int lcm = (n * m) / gcd;

            answer[0] = gcd;  // 최대공약수 저장
            answer[1] = lcm;  // 최소공배수 저장

            System.out.println(Arrays.toString(answer)); // [최대공약수, 최소공배수]

        }

        // 유클리드 호제법을 이용한 최대공약수(GCD) 계산
        private static int getGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }

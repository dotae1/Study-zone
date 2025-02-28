package org.com;

public class programmer_06 {
    public static void main(String[] args) {
        int num=626331;
        int count = 0; // 반복 횟수

        while (num != 1) { // num이 1이 될 때까지 반복
            if (count >= 500) {
                count = -1;// 500번 이상 반복하면 -1반환
            }
            if (num % 2 == 0) { // 짝수라면 2로 나눔
                num /= 2;
            } else if( num % 2 == 1) { // 홀수라면 3배 후 1을 더함
                num = num * 3 + 1;
            }

            count++; // 반복 횟수 증가
        }

        System.out.println(count); // 최종적으로 몇 번 반복했는지 반환
    }
}

/*
//확실히 이게 런타임시간이 줄어들었다.
class Collatz {
    public int collatz(int num) {
    long n = (long)num;
    for(int i=0; i<500; i++){
        if(n==1) return i;
      n = (n%2==0) ? n/2 : n*3+1;
    }

        return -1;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}

 */

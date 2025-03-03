    package org.com.programmers;

    public class programmers_07 {
        public static void main(String[] args) {
            int answer = 0;
            int[] number = {-1, -2, 0, 3};

            // 3중 for문으로 서로 다른 3명(i, j, k) 선택
            for (int i = 0; i < number.length - 2; i++) {       // 첫 번째 학생
                for (int j = i + 1; j < number.length - 1; j++) { // 두 번째 학생
                    for (int k = j + 1; k < number.length; k++) { // 세 번째 학생
                        if (number[i] + number[j] + number[k] == 0) {
                            answer++; // 합이 0이면 삼총사 하나 추가
                        }
                    }
                }
            }

            System.out.println(answer);

        }
    }

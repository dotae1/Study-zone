package org.com.rentprogram;

import java.util.Scanner;

public class Rentcapital {
    private int time;
    private String car;
    private int cash;
    private int acount; // 현재 계좌 잔액
    private Scanner scr = new Scanner(System.in);

    public void rental() {
        System.out.print("렌탈하고자 하는 차종을 입력하세요: ");
        this.car = scr.nextLine();

        System.out.print(car + "를 얼마나 빌릴지 분(정수)로 입력하세요: ");
        this.time = scr.nextInt();
        scr.nextLine(); // 버퍼 비우기

        cash = time * 1000; // 대여 요금 계산

        if (acount >= cash) { // 잔액 충분
            System.out.println("대여 요금은 " + cash + "원입니다.");
            System.out.println("잔액: " + acount + "원");
        } else { // 잔액 부족
            System.out.println("잔액이 부족합니다. 현재 잔액: " + acount + "원");
            System.out.print("추가로 입금할 금액을 입력하세요: ");
            int deposit = scr.nextInt();
            scr.nextLine(); // 버퍼 비우기
            acount += deposit;
            System.out.println("입금 완료! 현재 잔액: " + acount + "원");
        }

        System.out.println("\n메뉴로 돌아갑니다...\n");
    }

    public void acountplus() {
        System.out.println("렌탈 반납하고자 하는 차종을 입력하세요 : ");
        this.car = scr.nextLine();

        System.out.println("총 이용시간은 : " + time + "입니다.");
    }

    public void cash() {
        cash = time * 1000;
        System.out.println(car + "를 " + time + "분 동안 이용하셨습니다.");
        System.out.println("결제 금액: " + cash + "원");

        if (acount >= cash) {
            acount -= cash;
            System.out.println("결제가 완료되었습니다. 남은 잔액: " + acount + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + acount + "원");
        }
    }
}

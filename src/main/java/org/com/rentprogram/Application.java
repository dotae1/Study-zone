package org.com.rentprogram;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Guest guest = new Guest();

        Scanner scr = new Scanner(System.in);

        System.out.println("------------------------자동차 렌탈 시스템-------------------");
        System.out.println(" 1. 렌탈하기 : 2. 렌탈 반납하기 : 3. 대금 결제하기 : 9. 프로그램 종료");
        System.out.println("------------------------자동차 렌탈 시스템-------------------");

        System.out.print("원하는 옵션을 선택하세요 : ");
        int a = scr.nextInt();


        while (true) {
            switch (a) {
                case 1:
                    guest.rental();
                    break;
                case 2: guest.acountplus();

                    break;
                case 3:
                    guest.cash();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("맞는 번호를 입력해주세요 : ");
            }

            if (a == 9) {
                break;
            }
        }
    }
}

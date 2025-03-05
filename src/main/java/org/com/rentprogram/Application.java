package org.com.rentprogram;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Guest guest = new Guest();
        Scanner scr = new Scanner(System.in);

        while (true) { // 🚀 무한 반복으로 항상 메뉴를 출력
            System.out.println("------------------------자동차 렌탈 시스템-------------------");
            System.out.println(" 1. 렌탈하기 : 2. 렌탈 반납하기 : 3. 대금 결제하기 : 9. 프로그램 종료");
            System.out.println("------------------------자동차 렌탈 시스템-------------------");

            System.out.print("원하는 옵션을 선택하세요: ");
            int a = scr.nextInt();
            scr.nextLine(); // 버퍼 비우기

            switch (a) {
                case 1:
                    guest.rental(); // 렌탈 진행 후 메뉴로 복귀
                    break;
                case 2:
                    guest.acountplus();
                    break;
                case 3:
                    guest.cash();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    scr.close(); // 스캐너 닫기
                    return; // 🚀 프로그램 완전 종료
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }
}

package org.com.rentprogram;
import java.util.Scanner;

public class Rentcapital {
    private int time;
    private String  car;
    private int cash;
    private int acount;
    private int acountplus;
    private int money;

    Scanner scr = new Scanner(System.in);

    public void rental() {

        if(acount >0) {
            System.out.print("렌탈하고자 하는 차종을 입력하세요 : ");
            String car = scr.nextLine();
            this.car = car;
            scr.nextLine();
            System.out.print(car + "를 얼마나 빌릴지 분(정수)로 입력하세요 : ");
            int time = scr.nextInt();
            this.time = time;
        } else {
            System.out.println("돈이 부족합니다. 입금할 금액을 입력하세요 : ");
            acountplus = scr.nextInt();
            this.acount += acountplus;
        }
    }

    public void acountplus() {
        if(acount ==0) {
            System.out.println("금액을 얼마나 충전하시겠습니까?");
            money = scr.nextInt();
            this.acount += money;
        }
    }

    public void cash() {
        cash = time * 1000;
        System.out.print(car + "종을" + time + "동안 이용하셨습니다. 금액은" + cash + "결제해주시면 됩니다.");
        this.acount -= cash;
        System.out.println("계좌에 남은 금액은 :" + acount + "입니다.");
    }

}

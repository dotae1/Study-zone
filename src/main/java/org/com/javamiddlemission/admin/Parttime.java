package org.com.javamiddlemission.admin;

public class Parttime {
    private int money;
    private String name;

    public  Parttime(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void getInfo() {
        System.out.println("직원 이름 : " + name);
        System.out.println("급여 : " + money);
    }


}

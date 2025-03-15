package org.com.javamiddlemission.admin;

public class Application {
    public static void main(String[] args) {

        Parttime par = new Parttime("최다빈", 3000000);
        par.getInfo();

        System.out.println();

        Adminman adm = new Adminman("조재현", 300000000, "팀장");
        adm.getInfo();


    }
}

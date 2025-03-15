package org.com.javamiddlemission.admin;

public class Adminman extends Parttime {
    private String grade;


    public Adminman(String name, int money, String grade) {
        super(name, money);
        this.grade = grade;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("직책 : " + grade);
    }



}

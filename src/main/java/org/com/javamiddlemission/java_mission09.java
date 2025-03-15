package org.com.javamiddlemission;

import java.util.Scanner;

// 직사각형을 나타내는 Rectangle 클래스 생성
class Rectangle {
    private  int width;
    private  int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 넓이 계산 메서드
    public int getArea() {
        return width * height;
    }

    // 둘레 계산 메서드
    public int getPerimeter() {
        return 2 * (width + height);
    }
}

public class java_mission09 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("직사각형의 가로와 세로를 입력하세요: ");

        int width = scr.nextInt();
        int height = scr.nextInt();

        // Rectangle 객체 생성
        Rectangle rect = new Rectangle(width, height);

        // 넓이와 둘레 출력
        System.out.println("직사각형의 넓이: " + rect.getArea());
        System.out.println("직사각형의 둘레: " + rect.getPerimeter());

        scr.close();
    }
}

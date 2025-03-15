package org.com.javamiddlemission.squareprogram;

public class Application {
    public static void main(String[] args) {
        // 다양한 도형 객체 생성
        Shape circle = new Circle(5); // 반지름 5인 원
        Shape square = new Square(4, 6); // 가로 4, 세로 6인 사각형
        Shape triangle = new Triangle(3, 8); // 밑변 3, 높이 8인 삼각형

        // 도형별 면적 출력
        System.out.println(circle.name + "의 면적: " + circle.calculateArea());
        System.out.println(square.name + "의 면적: " + square.calculateArea());
        System.out.println(triangle.name + "의 면적: " + triangle.calculateArea());
    }
}


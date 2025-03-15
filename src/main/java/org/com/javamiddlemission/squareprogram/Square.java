package org.com.javamiddlemission.squareprogram;

class Square extends Shape implements AreaCalculable {
    private double width, height;

    public Square(double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // 사각형 면적: 가로 × 세로
    }
}
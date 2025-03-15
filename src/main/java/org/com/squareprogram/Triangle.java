package org.com.squareprogram;

class Triangle extends Shape implements AreaCalculable {
    private double base, height;

    public Triangle(double base, double height) {
        super("삼각형");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // 삼각형 면적: (밑변 × 높이) / 2
    }
}

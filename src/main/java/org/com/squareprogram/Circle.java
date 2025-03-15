package org.com.squareprogram;

public class Circle extends Shape implements AreaCalculable {
    private double radius;

    public Circle(double radius) {
        super("원");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

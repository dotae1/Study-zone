package org.com.square;

public class Circle extends Type {
    private double radius;

    public Circle(double radius){
        super("원");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

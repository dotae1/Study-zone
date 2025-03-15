package org.com.javamiddlemission.square;

public class Square extends Type {
    private double width, height;

    public Square(double width, double height){
        super("시긱형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

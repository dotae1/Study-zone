package org.com.javamiddlemission.square;

public class Triangle extends Type{

    private int a, b;

    public Triangle(int a, int b){
        super("삼각형");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b*0.5;
    }
}

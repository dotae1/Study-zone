package org.com.javamiddlemission.square1;

import org.com.javamiddlemission.square1.Circle;
import org.com.javamiddlemission.square1.Squ;
import org.com.javamiddlemission.square1.Triangle;

public class java_mission13 {
    public static void main(String[] args) {

        org.com.javamiddlemission.square1.Square circle = new Circle(5);
        org.com.javamiddlemission.square1.Square squ= new Squ(4, 6);
        Square triangle = new Triangle(3, 8);

        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculateArea());
        System.out.println(squ.calculateArea());

    }
}

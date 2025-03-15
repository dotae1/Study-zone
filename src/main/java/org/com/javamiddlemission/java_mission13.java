package org.com.javamiddlemission;

import org.com.mission.Circle;
import org.com.mission.Squ;
import org.com.javamiddlemission.square1.Square;
import org.com.mission.Triangle;

public class java_mission13 {
    public static void main(String[] args) {

        Square circle = new Circle(5);
        Square squ= new Squ(4, 6);
        Square triangle = new Triangle(3, 8);

        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculateArea());
        System.out.println(squ.calculateArea());

    }
}

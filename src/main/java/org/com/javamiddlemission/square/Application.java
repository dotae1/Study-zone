package org.com.javamiddlemission.square;

public class Application {
    public static void main(String[] args) {
        Type[] types = new Type[3];

        types[0] = new Circle(5);
        types[1] = new Square(4, 6);
        types[2] = new Triangle(3, 4);

        for(Type type : types){
            type.getInfo();
        }
    }
}

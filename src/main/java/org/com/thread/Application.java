package org.com.thread;

public class Application {
    public static void main(String[] args) {


        Thread t1 = new Cat();
        Thread t2 = new Dog();


        t1.start();
        t2.start();
    }
}

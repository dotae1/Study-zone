package org.com.javamiddlemission.square;

public abstract class Type {

    protected String kinds;

    public Type() {}


    public Type(String kinds) {
        this.kinds = kinds;
    }

    public abstract double calculateArea();

    public void getInfo() {
        System.out.println(kinds + "의 면적 : " + calculateArea());
    }


}

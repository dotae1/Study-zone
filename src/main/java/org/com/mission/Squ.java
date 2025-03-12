package org.com.mission;

class Squ implements Square {
    private double width, height;

    public Squ(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}


package org.com.javamiddlemission.square1;


public interface Calculator {


    @FunctionalInterface
    public interface Sum {
        int sum(int a, int b);
    }

    @FunctionalInterface
    public interface Min {
        int min(int a, int b);
    }

    @FunctionalInterface
    public interface Mul {
        int mul(int a, int b);
    }

    @FunctionalInterface
    public interface Div {
        int div(int a, int b);
    }
}

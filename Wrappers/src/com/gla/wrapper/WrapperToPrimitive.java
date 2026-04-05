package com.gla.wrapperAssing.Assingment;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;

        double d1 = d;           // auto-unboxing
        int i = (int) d1;        // casting

        System.out.println("Double value: " + d1);
        System.out.println("Integer value: " + i);
    }
}

package com.gla.wrapperAssing.ScenerioBased;

import java.util.*;

public class SensorLogger {
    static ArrayList<Double> data = new ArrayList<>();

    public static void addValue(double val) {
        data.add(val); // auto-boxing
    }

    public static void addValue(Double val) {
        data.add(val);
    }

    public static void main(String[] args) {
        addValue(25.5);
        addValue(Double.valueOf(30.2));

        for (double d : data) {
            System.out.println(d); // auto-unboxing
        }
    }
}

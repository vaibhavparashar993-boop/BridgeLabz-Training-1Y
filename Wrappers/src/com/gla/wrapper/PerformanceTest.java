package com.gla.wrapperAssing.ScenerioBased;

import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 1000000;

        // Array
        long start = System.currentTimeMillis();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;

        long sum = 0;
        for (int i : arr)
            sum += i;

        long end = System.currentTimeMillis();
        System.out.println("Array time: " + (end - start));

        // ArrayList
        start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(i);

        sum = 0;
        for (int i : list)
            sum += i;

        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));
    }
}

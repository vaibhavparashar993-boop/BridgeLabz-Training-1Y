package com.gla.wrapperAssing.ScenerioBased;

import java.util.*;

public class Rating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int i : arr)
            combined.add(i);

        for (Integer i : list)
            if (i != null)
                combined.add(i);

        double sum = 0;
        for (int i : combined)
            sum += i;

        System.out.println("Average: " + sum / combined.size());
    }
}

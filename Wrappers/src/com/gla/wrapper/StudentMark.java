package com.gla.wrapperAssing.ScenerioBased;

import java.util.*;

public class StudentMark{
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "88", "null", "abc"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : inputs) {
            try {
                list.add(Integer.parseInt(s));
            } catch (Exception e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for (int i : list)
            sum += i;

        System.out.println("Average: " + (sum / list.size()));
    }
}

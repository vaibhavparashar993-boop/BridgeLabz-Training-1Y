package com.gla.wrapperAssing.ScenerioBased;

public class LoginValidation {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] testInputs = {"20", "15", "abc", "18"};

        for (String input : testInputs) {
            if (isValidAge(input)) {
                System.out.println(input + " -> Valid (Allowed)");
            } else {
                System.out.println(input + " -> Invalid (Not Allowed)");
            }
        }
    }
}
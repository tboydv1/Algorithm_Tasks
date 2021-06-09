package com.algo.toptal;

public class PhoneNumberReformat {

    public static String solution(String S) {
        // write your code in Java SE 8

        String numbers = "";

        StringBuilder phoneBuilder = new StringBuilder();

        for(int i = 0; i < S.length(); i++){

            if(Character.isDigit(S.charAt(i))){
                phoneBuilder.append(String.valueOf(S.charAt(i)));
            }
        }

        System.out.println("bug --> "+phoneBuilder.toString());


        numbers = insertDashes(phoneBuilder.toString());

        return numbers;
    }

    private static String insertDashes(String numbers){
        StringBuilder phoneBuilder = new StringBuilder();


        if(numbers.length() % 3 == 0) {
            for (int i = 0; i < numbers.length(); i++) {
                if (i % 3 == 0 && i > 1) {
                    phoneBuilder.append("-");
                }

                phoneBuilder.append(String.valueOf(numbers.charAt(i)));

            }
        }

        return phoneBuilder.toString();
    }

    public static void main(String[] args) {
        String value = "00-44   48 5555 836133 79";

        String result = solution(value);
        System.out.println(result);
    }
}

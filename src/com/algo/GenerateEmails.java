package com.algo;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class GenerateEmails {

    public static void main(String[] args) {
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
                's','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0' };
        SecureRandom random = new SecureRandom();


        List<String> emails = new ArrayList<>();

        for(int i = 0; i < 200; i++){

            StringBuilder email = new StringBuilder();

            for(int j = 0; j < 5; j++){
                int n = random.nextInt(35);
                email.append((letters[n]));
            }
            emails.add(email+"@mailpoof.com");
        }

        emails.forEach(System.out::println);
    }
}

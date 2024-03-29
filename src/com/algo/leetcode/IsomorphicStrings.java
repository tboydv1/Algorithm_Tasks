package com.algo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 *No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {

    public static void main(String[] args) {

//        System.out.println(isIsomorphic(
//                "badc",
//                "baba"));

//        System.out.println(isIsomorphic(
//                "egg",
//                "add"));

//        System.out.println(isIsomorphic(
//                "egcd",
//                "adfd"));

        System.out.println(normalize("egcd") + " "+normalize("adfd"));

    }

    public static boolean isIsomorphicA(String s, String t) {

        String[] sArr = s.split("");
        String[] tArr = t.split("");

        Map<String, String> values = new HashMap<>();
        for(int i = 0; i < sArr.length; i++){

            if(!values.containsKey(sArr[i])){

                for (Map.Entry<String, String> entry : values.entrySet()) {
                    if (entry.getValue().equals(tArr[i])) {
                        if(!entry.getKey().equals(sArr[i])){
                            return false;
                        }
                        else{
                            break;
                        }
                    }
                }
                System.out.println(2+ " "+sArr[i]+" "+tArr[i]);
                values.put(sArr[i], tArr[i]);
            }
            else if(values.get(sArr[i]).equals(tArr[i])){
                System.out.println(2+ " "+sArr[i]+" "+tArr[i]);
                values.put(sArr[i], tArr[i]);
            }
            else{
                return false;
            }
        }

        return true;
    }


    public static boolean isIsomorphicB(String s, String t) {

        return normalize(s) == normalize(t);
    }

    public static String normalize(String word){

        Map<String, String> records = new HashMap<>();

        char nextChar = 'a';
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!records.containsKey(String.valueOf(c))){
                records.put(String.valueOf(c), String.valueOf(nextChar));
                nextChar += 1;
                System.out.println(nextChar);
            }
            ans.append(records.get(String.valueOf(c)));
        }

        return ans.toString();
    }




}

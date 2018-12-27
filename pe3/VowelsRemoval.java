package com.stackroute.unittest.pe3;

import java.util.Arrays;
import java.util.List;

public class VowelsRemoval {

    public static void main(String[] args) {
        String str = "India \n United States\nGermany\nEgypt\nczechoslovakia";

        System.out.println(remVowel(str));

    }

    public static String remVowel(String str) {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if (al.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, "");
                i--;
            }
        }

           return sb.toString();
    }
}

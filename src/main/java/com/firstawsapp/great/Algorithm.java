package com.firstawsapp.great;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Algorithm{

    public static String reverseStringKeepSpecials(String s) {
        // Step 1: Identify and store positions of special characters
        Map<Integer, Character> specialCharPositions = new HashMap<>();
        StringBuilder alnumStrBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                specialCharPositions.put(i, c);
            } else {
                alnumStrBuilder.append(c);
            }
        }

        // Step 2: Reverse the string of alphanumeric characters
        String alnumStr = alnumStrBuilder.toString();
        StringBuilder reversedAlnumStrBuilder = new StringBuilder(alnumStr).reverse();

        // Step 3: Reinsert special characters
        for (Map.Entry<Integer, Character> entry : specialCharPositions.entrySet()) {
            reversedAlnumStrBuilder.insert(entry.getKey(), Optional.ofNullable(entry.getValue()));
        }

        return reversedAlnumStrBuilder.toString();
    }


}

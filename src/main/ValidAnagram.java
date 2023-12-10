package main;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String first, String second) {
        char[] firstList = first.toCharArray();
        char[] secondList = second.toCharArray();

        Arrays.sort(firstList);
        Arrays.sort(secondList);

        return Arrays.equals(firstList, secondList);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}

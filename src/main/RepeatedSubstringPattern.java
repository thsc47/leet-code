package main;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        var result = repeatedSubstringPattern("test");
        System.out.println(result);
    }
}
package main;

public class FindTheDifference {


    public static char findTheDifference(String s, String t) {
        char c = 0;
        for(char c1 : s.toCharArray()) c ^= c1;
        for(char c2 : t.toCharArray()) c ^= c2;
        return c;
    }


    public static void main(String[] args) {
        var a = findTheDifference("abcd", "abcde");
        System.out.println(a);
    }
}
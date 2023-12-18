package main;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        return a[a.length -1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); //5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); //4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); //6
    }
}

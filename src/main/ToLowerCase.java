package main;

public class ToLowerCase {

    public static String toLowerCase(String s) {
        return s.trim().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }
}

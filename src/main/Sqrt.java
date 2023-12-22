package main;

public class Sqrt {

    public static int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}

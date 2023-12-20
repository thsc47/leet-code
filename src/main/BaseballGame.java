package main;

import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int res = stack.get(stack.size() - 2) + stack.peek();
                    stack.add(res);
                    result += res;
                }
                case "D" -> {
                    int res = stack.peek() * 2;
                    stack.add(res);
                    result += res;
                }
                case "C" -> result -= stack.pop();
                default -> {
                    int res = Integer.parseInt(operation);
                    stack.add(res);
                    result+=res;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array1 = new String[]{"5","2","C","D","+"};
        String[] array2 = new String[]{"5","-2","4","C","D","9","+","+"};
        String[] array3 = new String[]{"1","C"};

        System.out.println(calPoints(array1));
        System.out.println(calPoints(array2));
        System.out.println(calPoints(array3));
    }
}

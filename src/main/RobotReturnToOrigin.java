package main;

import static java.lang.String.format;

public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        char[] movesArray = moves.toCharArray();
        int[] verifyMoves = new int[2];

        for (int i = 0; i < movesArray.length; i++) {
            switch (movesArray[i]) {
                case 'R' -> {
                    verifyMoves[1] += 1;
                }
                case 'L' -> {
                    verifyMoves[1] -= 1;
                }
                case 'U' -> {
                    verifyMoves[0] += 1;
                }
                case 'D' -> {
                    verifyMoves[0] -= 1;
                }
            }
        }
        System.out.println(format("up: %d | down: %d", verifyMoves[0] , verifyMoves[1]));
        return (verifyMoves[0] == 0) && (verifyMoves[1] == 0);
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDL"));
        //System.out.println(judgeCircle("LL"));
    }
}

package main;

public class TictactoeChecker {

    public String tictactoe(int[][] moves) {
        var board = getFilledBoard(moves);

        for (var i = 0; i < 3; i++) {
            if (board[i][0] != null && board[i][0] == board[i][1] && board[i][1] == board[i][2]) // check rows
                return board[i][0] == 'X' ? "A" : "B";
            if (board[0][i] != null && board[0][i] == board[1][i] && board[1][i] == board[2][i]) // check columns
                return board[0][i] == 'X' ? "A" : "B";
        }

        if (board[1][1] != null &&
                (board[0][0] == board[1][1] && board[1][1] == board[2][2] || // check primary diagonal
                        board[2][0] == board[1][1] && board[1][1] == board[0][2]))  // check secondary diagonal
            return board[1][1] == 'X' ? "A" : "B";

        return moves.length == 9 ? "Draw" : "Pending";
    }

    private Character[][] getFilledBoard(int[][] moves) {
        var board = new Character[3][3];
        for (var i = 0; i < moves.length; i++)
            board[moves[i][0]][moves[i][1]] = ((i & 1) == 0) ? 'X' : 'O';
        return board;
    }
}

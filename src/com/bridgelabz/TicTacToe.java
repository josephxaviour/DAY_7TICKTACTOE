package com.bridgelabz;

public class TicTacToe {
static char[] board = new char[0];
}
public class TicTakToeProblem {
    static char[] board = new char[0];

    char input() {
        int randomChar = (int) Math.floor(Math.random() * 10 % 2);
        if (randomChar == 1) {
            return 'x';
        } else {
            return '0';
        }
    }
    public static void main(String[] args) {
        
    }
}
public class TicTacToeProblem {
    static char[] board = new char[9];

    char input() {
        int randomChar = (int) Math.floor(Math.random() * 10 % 2);
        if (randomChar ==1) {
            return 'x';
        } else {
            return '0';
        }
        }
static void printBoard() {
        for(int i=0; i< board.length;i++){
            System.out.println(board[i]);
        }
}
    public static void main(String[] args) {
        
    }
}
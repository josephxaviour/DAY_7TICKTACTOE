package com.bridgelabz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    static String[] board = new String[9];
    static String turn;
     static void printBoard() {
         for (int i=0; i< board.length; i++) {
             System.out.println(board[i]);
         }
     }
static String checkWinner() {

     for (int a=0; a<9;a++) {
         if(Arrays.asList(board).contains(
                 String.valueOf(a + 1))) {
             break;
         } else if (a == 8) {
             return "draw";
         }

         return null;
         }

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner = null;
        turn = 'x';
        while (winner == null) {
            int numInput = in.nextInt();
            for(int a=0; a<9;a++) {
                board[a] = String.valueOf(a + 1);
            }
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("x")) {
                    turn = "0";
                } else {
                    turn = "x";

                }
                printBoard();
                winner = checkWinner();
            }else {
                System.out.println("slot allready taken, re-enter slot no");
            }
            }
            }
        }
    }
public class TicTacToeProblem {
    static String[] board = new String[9];
    static String turn;

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
    }

    static String checkWinner() {
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner = null;
        turn = "x";
        System.out.println("x will play first. Enter a slot no to place x in:");

        while (winner == null) {
            int numInput = in.nextInt();
            for (int a = 0; a < 9; a++) {
                board[a] = String.valueOf(a + 1);
            }
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("x")) {
                    turn = "0";
                } else {
                    turn = "x";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("slot allready taken; re enter slot no");
            }
        }
    }
}
public class TicTacToeProblem {
    static String[] board = new String[9];
    static String[] board = mew String[9];
    static String turn;

    static void printBoard(){
        for(int i=0;i<board.length;i++) {
            System.out.println(board[i]);
        }
    }
static String checkWinner()
{
    for(int a=0 ; a<9; a++){
        if (Arrays.asList(board).contains(
                String.valueOf(a + 1))) {
            break;
        }
        else if (a==8) {
            return "draw";
        }
    }
    System.out.println(
            turn +"s turn; enter a slot no to place  " + turn +"in:");
    return null;
}
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner = null;
        turn = "x";
        System.out.println(
                "x will play first. Enter a slot no to place x in:");

        while (winner == null) {
            int numInput = in.nextInt();
            for (int a = 0; a < 9; a++) {
                board[a] = String.valueOf(a + 1);
            }
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                if (turn.equals("x")) {
                    turn = "0";
                } else {
                    turn = "x";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("slot allready taken; re-enter slot number:");
            }
        }
    }
}
public class TicTacToeProblem {
    static String[] board = new String[9];
    static String turn;

    static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
            }
            if (line.equals("xxx")) {
                return "0";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }

        System.out.println(turn + "s turn; enter a slot number to place" + turn + "in");
        return null;
    }
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner = null;
        turn = "x";
        System.out.println("x will play first. Enter a slot no to place x in:");
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
        while (winner == null) {
            int numinput = in.nextInt();

            if (board[numinput - 1].equals(
                    String.valueOf(numinput))) {
                board[numinput - 1] = turn;
                if (turn.equals("x")) {
                    turn = "0";
                } else {
                    turn = "x";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("slot already taken; re-enter slot no;");
            }
        }
    }
}

if (winner.equalsIgnoreCase("draw")) {
    System.out.println("it's a draw! thanks for playing");
    }
else { System.out.println("congratulations!"+ winner +"'s have won! thanks for playing");
        }


public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        startGame();
        System.out.println("type YES to continue and NO to stop");
        String replay=in.nextLine();

        if(replay == "YES" ){
            startGame();
        }
}
        





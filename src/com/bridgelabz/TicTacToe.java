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
package com.algo.leetcode;

import java.util.Arrays;

public class TicTacToeWinner {

    /*
    Tic-tac-toe is played by two players A and B on a 3 x 3 grid.

Here are the rules of Tic-Tac-Toe:

Players take turns placing characters into empty squares (" ").
The first player A always places "X" characters, while the second player B always places "O" characters.
"X" and "O" characters are always placed into empty squares, never on filled ones.
The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
The game also ends if all squares are non-empty.
No more moves can be played if the game is over.
Given an array moves where each element is another array of size 2 corresponding to the row and column of the grid where they mark their respective character in the order in which A and B play.

Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw", if there are still movements to play return "Pending".

You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the grid is initially empty and A will play first.
     */




    public static String tictactoe(int[][] moves) {

        String[][] game = new String[3][3];

        int mc = 1;
        int x = 0;
        int y = 1;

        for(int i = 0; i < moves.length; i++){

            System.out.println(mc + "-->  \n");

            if(mc == 1){
                System.out.println("first");
                game[moves[i][0]][moves[i][1]] = "X";
                mc++;
                displayGame(game);

                continue;
            }

            if(mc % 2 == 0) {
                System.out.println("mv == O  " + (2 % mc));
                game[moves[i][0]][moves[i][1]] = "O";
            }
            else  {
                System.out.println("mv == X  " + (2 % mc));

                game[moves[i][0]][moves[i][1]] = "X";
            }

            mc++;


            displayGame(game);
            System.out.println();



        }

        displayGame(game);

        return "";
    }

    public static void main(String[] args) {
        int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        tictactoe(moves);
    }

    public static String checkWinner(String[][] game, int [][] lm){
//
//        for(int i = 0; i < game;)
//
//
//=
        return "";

    }


    public static void displayGame(String[][] game){
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[i].length; j++){
                if(game[i][j] == null){
                    System.out.print("-");
                }
                else
                 System.out.print(game[i][j]);
            }
            System.out.println();
        }
    }



}

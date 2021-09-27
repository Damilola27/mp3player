package practice;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] ticTacToe = new String[3][3];

        displayTicTacToe(ticTacToe);


        int playerOne;
        int playerTwo;

        while (true) {
            System.out.println("Player 1: Enter position to play");
            playerOne = input.nextInt() - 1;
            int row = playerOne / 3;
            int column = playerOne % 3;


            ticTacToe[row][column] = "X";
            displayTicTacToe(ticTacToe);

            System.out.println("Player 2: Enter position to play");
            playerTwo = input.nextInt() - 1;
            row = playerTwo / 3;
            column = playerTwo % 3;

            ticTacToe[row][column] = "O";
            displayTicTacToe(ticTacToe);

        }

    }

    private static void displayTicTacToe(String[][] ticTacToe) {
        for (int row = 0; row < ticTacToe.length; row++) {
            for (int column = 0; column < ticTacToe[row].length; column++) {
                System.out.printf("%10s", ticTacToe[row][column]);

            }
            System.out.println();
            System.out.println();

        }

    }
}

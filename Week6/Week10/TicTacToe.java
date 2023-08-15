package Week6.Week10;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
  
    char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();
}
public static void printGameBoard (char [][] gameBoard) {
    for(char[] row : gameBoard) {
        for (char c : row){
            System.out.println(c);
        }
        System.out.println();
    }
}
}

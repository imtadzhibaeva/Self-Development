package Week6.Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

   static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
   static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
  
    char [][] gameBoard = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};

while(true) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int playerPos = scan.nextInt();


        placePiece(gameBoard, pos, "player");
        Random rand = new Random();
        int cpuPos = rand.nextInt(9) +1;
        placePiece(gameBoard, pos, "cpu");

        printGameBoard(gameBoard);
}
    }
public static void printGameBoard (char [][] gameBoard) {
    for(char[] row : gameBoard) {
        for (char c : row){
            System.out.println(c);
        }
        System.out.println();
    }
}

public static void placePiece(char[][] gameBoard, int pos, String user) {

    char symbol = ' ';

    if(user.equals("player")) {
        symbol = 'x';
    } else if(user.equals("cpu")){
        symbol = '0';
    }

    switch(pos) {
            case 1:
                  gameBoard [0][0] = symbol;
                  break;
            case 2:
                  gameBoard [0][2] = symbol;
                  break;
            case 3:
                  gameBoard [0][4] = symbol;
                  break;
             case 4:
                  gameBoard [2][0] = symbol;
                  break;
            case 5:
                  gameBoard [2][2] = symbol;
                  break;
            case 6:
                  gameBoard [2][4] = symbol;
                  break;
            case 7:
                  gameBoard [4][0] = symbol;
                  break;
            case 8:
                  gameBoard [4][2] = symbol;
                  break;  
                  case 9:
                  gameBoard [4][4] = symbol;
                  break;  
                  default:
                  break;                                 
        }
}
public static String checkWinner() {

List topRow = Array.asList(1, 2, 3);
List midRow = Array.asList(4, 5, 6);
List botRow = Array.asList(7, 8, 9);
List leftCol = Array.asList(1, 4, 7);
List midCol = Array.asList(2, 5, 8);
List rightCol = Array.asList(3, 6, 9);
List cross1 = Array.asList(1, 5, 9);
List cross2 = Array.asList(7, 5, 3);

List<List> winning = new ArrayList<List>();
winning.add(topRow);
winning.add(midRow);
winning.add(botRow);
winning.add(leftCol);
winning.add(midCol);
winning.add(rightCol);
winning.add(cross1);
winning.add(cross2);

    return "";
}
}

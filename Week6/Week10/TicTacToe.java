package Week6.Week10;

public class TicTacToe {
    public static void main(String[] args) {
  
    char [] [] gameBoard = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
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

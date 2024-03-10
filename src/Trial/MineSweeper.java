package Trial;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {                  // Evaluation form article 5
    public String[][] map;
    public String[][] board;
    public int rowNumber;
    public int colNumber;
    public int mineNumber;

    public MineSweeper() {


        //Initializing the game

        boolean isStart = true;

        System.out.println("Welcome to the Minesweeper. \nPlease enter row and column lenght to create the mine field.");

        //This function checks if the game  initializes properly.
        //Game does not start until the row and column >2
        while (isStart) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many rows? : ");
            int rowNumberInput = scanner.nextInt();         // Evaluation form article 7
            System.out.print("How many columns? : ");
            int colNumberInput = scanner.nextInt();

            if (rowNumberInput < 2 || colNumberInput < 2) {
                System.out.println("Try again");
            } else {
                isStart = false;
            }


            this.rowNumber = rowNumberInput;
            this.colNumber = colNumberInput;
            this.mineNumber = (rowNumber * colNumber) / 4;      //Evaluation form article  8
            this.map = new String[rowNumber][colNumber];        //Number of mines will be quarter of row x column
            this.board = new String[rowNumber][colNumber];

            initBoard();
            placeMines();
            fillBoardWithMineNumbers();
        }
    }


    // These two method will print the maps.

    public void printBoard() {                                   //This method will be used before and after the game to reveal the map with mines.
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void printMap() {                                     //This method will be used in game to track the game progress
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    //
    public void initBoard() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {                // Initializing the field with "-" values with the given column and row lenghts.
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }
    }

    public void placeMines() {
        int count = 0;
        Random random = new Random();

        while (count < mineNumber) {
            int row = random.nextInt(rowNumber);                //Evaluation form article 8
            int col = random.nextInt(colNumber);                //This will randomize the mine spawns

            if (!map[row][col].equals("*")) {
                map[row][col] = "*";
                count++;
            }
        }
    }

    public void fillBoardWithMineNumbers() {                    //Evaluation form article 12
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (!map[i][j].equals("*")) {
                    map[i][j] = String.valueOf(countMines(i, j));
                }
            }
        }
    }

    public int countMines(int row, int col) {       //Evaluation form article 12
        int count = 0;                              //This method will check if there is a mine (*) in the perimeter of the selected coordinate.

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (isInBounds(row + i, col + j) && map[row + i][col + j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isInBounds(int row, int col) {                               // This is a simple method to check if the given coordinate is in bounds or not
        return row >= 0 && row < rowNumber && col >= 0 && col < colNumber;      //Evaluation form article 10
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        int count = 0;
        boolean retry;           // This function will be added to the game in the future.

        System.out.println("The mine field for the reviewer");

        printMap();              // This will show the minefield beforehand for the reviewer



        while (game) {

            System.out.println("========");
            printBoard();                         //Evaluation form article 11
            System.out.println("========");


            System.out.print("Row : ");
            int row = scanner.nextInt();
                                                 //Evaluation form article 9
            System.out.print("Column : ");       //Takes the desired coordinates from user
            int col = scanner.nextInt();


            if (!isInBounds(row, col)) {
                System.out.println("Invalid position, please try again.");
                continue;
            }

            if (board[row][col] != "-") {
                System.out.println("This position have been choosen before. Please select another one.");
                continue;
            }

            if (map[row][col].equals("*")) {        //Evaluation form article 13
                game = false;                       //If there is a mine in the given coordinates, loop breaks, game is lose.
                System.out.println("You Lose!!!");
            } else {
                board[row][col] = map[row][col];    //Evaluation form article 11
                count++;
            }

            if (count == (rowNumber * colNumber - mineNumber)) {                //Evaluation form article 14
                game = false;                                                   //This method will check if the "count" equals the coordinates without mines.
                System.out.println("\nYou Win !");                              //Example ; in a 3x4 field, there is 3 mines and if the "count" 9 times successfully, game win
            }
        }

        System.out.println("========");
        printMap();



    }



}


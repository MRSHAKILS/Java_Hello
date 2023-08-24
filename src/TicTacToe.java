import java.util.Scanner;

public class TicTacToe {

    // Board size
    private static final int ROWS = 3;
    private static final int COLS = 3;

    // The board
    private static char[][] board = new char[ROWS][COLS];

    // The players
    private static char player1 = 'X';
    private static char player2 = 'O';

    // The current player
    private static char currentPlayer;

    // Initialize the board
    private static void initBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the board
    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            System.out.print("| ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Get a move from the player
    private static void getMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.print("Player " + currentPlayer + ", enter row (1-3) and column (1-3) separated by space: ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row >= ROWS || col < 0 || col >= COLS || board[row][col] != '-');

        board[row][col] = currentPlayer;
    }

    // Check if the game is over
    private static boolean isGameOver() {
        // Check rows
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < COLS; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        // Check if the board is full
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // Game is a tie
        return true;
    }

    // Switch to the other player
    private static void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public static void main(String[] args) {

    }

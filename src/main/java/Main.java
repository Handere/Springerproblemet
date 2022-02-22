import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chessboardSize;
        int startingColumn;
        int staringRow;
        boolean solved;

        // Read the size of the chessboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chessboard size: ");
        chessboardSize = scanner.nextInt();

        // Read the starting position of the knight
        System.out.print("Starting column: ");
        startingColumn = scanner.nextInt();

        System.out.print("Starting row: ");
        staringRow = scanner.nextInt();

        // Create new Chessboard
        Chessboard chessboard = new Chessboard(chessboardSize);

        // Finding solution to the knight problem
        solved = chessboard.findSolution(startingColumn, staringRow);

        // Write the solution
        if (solved) {
            System.out.println("The solution is:\n" + chessboard);
        }
        else {
            System.out.println("No solution was found.");
        }
    }
}

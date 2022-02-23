public class Chessboard {
    private int size;
    private int numberOfMoves = 0;

    final int VACANT = 0;
    final int OCCUPIED = 1;

    private int[][] chessboard;
    private int[][] cellOccupied;

    public Chessboard(int size) {
        this.size = size;
        chessboard = new int[size][size];
        cellOccupied = new int[size][size];
    }

    public boolean findSolution(int column, int row) {

        //Start of round, setting the current position as occupied and adding the last move
        numberOfMoves++;
        cellOccupied[column][row] = OCCUPIED;
        chessboard[column][row] = numberOfMoves;

        //Stop criteria
        if (numberOfMoves == (size * size)) {
            chessboard[column][row] = numberOfMoves;
            cellOccupied[column][row] = OCCUPIED;

            return true;
        }

        //Coordinates for possible moves
        int[] columnMove = {2, 2, -1, 1, -2, -2, -1, 1};
        int[] rowMove = {-1, 1, 2, 2, -1, 1, -2, -2};

        //Trying all 8 legal moves for the knight
        for (int k = 0; k < 8; k++) {
            int newColumn = column + columnMove[k];
            int newRow = row + rowMove[k];

            //Check if the move is legal
            if (newColumn >= 0 && newColumn < size && newRow >= 0 && newRow < size && cellOccupied[newColumn][newRow] != OCCUPIED) {

                //Try to find next move
                if (findSolution(newColumn, newRow)) {
                    return true;
                }
            }
        }

        cellOccupied[column][row] = VACANT;
        chessboard[column][row] = VACANT;
        numberOfMoves--;

        return false;
    }

    public String toString() {
        StringBuilder output = new StringBuilder("\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                output.append(chessboard[i][j]).append(" ");
            }
            output.append("\n");
        }
        return String.valueOf(output);
    }
}

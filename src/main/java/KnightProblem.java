public class KnightProblem {
    private int size;
    private int startingColumn;
    private int startingRow;

    final int VACANT = 0;
    final int OCCUPIED = 1;

    private int chessboard[][];
    private int cellOccupied[][];

    public KnightProblem(int size, int startingColumn, int startingRow) {
        this.size = size;
        this.startingColumn = startingColumn;
        this.startingRow = startingRow;
        chessboard = new int[size][size];
    }

}

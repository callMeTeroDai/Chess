package com.chess.engine.board;


public class BoardUtils {
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] SECOND_ROW = initRow(8);
    public static final boolean[] SEVENTH_ROW = initRow(48);

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES__PER_ROW = 8;

    private BoardUtils(){
        throw new RuntimeException("You cannot instantiate me");
    }

    private static boolean[] initColumn(int columnNumber) {

        final boolean[] column = new boolean[NUM_TILES];
        do{
            column[columnNumber] = true;
            columnNumber += NUM_TILES__PER_ROW;
        }
        while(columnNumber < NUM_TILES);
        return column;
    }

    private static boolean[] initRow(int rowNumber){
        final boolean[] row = new boolean[NUM_TILES];
        do{
            row[rowNumber]=true;
            rowNumber++;
        }
        while(rowNumber % NUM_TILES__PER_ROW != 0);
        return row;
    }


    public static boolean isValidCoordinate(final int candidateDestiantionCoodrinate) {
        return candidateDestiantionCoodrinate >=0 && candidateDestiantionCoodrinate <NUM_TILES;
    }
}

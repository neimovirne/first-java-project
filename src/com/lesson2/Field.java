package com.lesson2;

import java.util.LinkedHashMap;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void ereseField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            eraseLine(i);
        }
    }

    public void showField(){
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++){
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void eraseLine (int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber){
        for (int i = 0; i < FIELD_SIZE; i++) {
            showCell(i, lineNumber);
        }
    }

    private void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");
    }
}



/* items char [ , , ]
               0 1 2

               [][][]
               [][][]
               [][][]
*/
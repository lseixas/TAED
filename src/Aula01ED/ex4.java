package Aula01ED;

import helpers.CreateMatrix;

import java.util.ArrayList;

public class ex4 {

    public static void func() {

        int size = 7;
        long[] N = {10, 50, 100, 500, 1000, 5000, 10000};

        int cols = 10000;
        int rows = 10000;
        ArrayList<long[]> transposed = new ArrayList<>();

        long[][] array = CreateMatrix.createMatrix(rows, cols, -1);

        for(int i = 0; i < cols; i++) {
            long[] new_row = new long[rows];
            for(int j = 0; j < rows; j++) {
                new_row[j] = array[j][i];
            }
            transposed.add(new_row);
        }


    }

    public static void main(String[] args) {

        func();

    }

}

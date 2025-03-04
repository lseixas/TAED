package Aula01ED;

import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex3 {

    public static ArrayList<long[]> func() {

        int size = 6;
        int[] N = {10, 50, 100, 500, 100000, 1000};
        int[] M = {10, 75, 300, 200, 1, 1000};

        long[] n = {10, 50, 100, 500, 100000, 1000};
        long[] times = new long[size];
        long[] operations = new long[size];
        long[] comparisons = new long[size];

        for(int i = 0; i < size; i++) {

            int compar = 0;
            int opr = 1; //declaração da matriz conta como uma operação

            long startTime = System.nanoTime();

            double[][] matrix = new double[N[i]][M[i]];
            opr++;

            opr++;
            for(int row = 0; row < N[i]; row++) {
                compar++;

                opr++;
                for(int col = 0; col < M[i]; col++) {
                    compar++;

                    matrix[row][col] = -1;
                    opr++;
                }
            }

            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            matrix = null;
            System.gc();

            times[i] = timeElapsed;
            operations[i] = opr;
            comparisons[i] = compar;

        }

        ArrayList<long[]> data = new ArrayList<>();

        data.add(n);
        data.add(times);
        data.add(operations);
        data.add(comparisons);

        return data;

    }

    public static void main(String[] args) throws IOException {

        ArrayList<long[]> data = new ArrayList<>();

        data = Repeater.repeater01(ex3::func, 5, 6);

        data = TransforMatrix.transform_long(data);

        StringBuilder line = new StringBuilder();
        String[] string_array = new String[6];

        for(int i = 0; i < 6; i++) {
            line.setLength(0);
            for(int j = 0; j < 4; j++) {
                line.append(data.get(i)[j]).append(",");
            }
            string_array[i] = line.toString();
        }

        CsvExporter.write_csv("dadosMediosEx3.csv", string_array);

    }


}

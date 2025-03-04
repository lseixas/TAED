package Aula01ED;

import helpers.CreateMatrix;
import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex4 {

    public static ArrayList<long[]> func() {

        int size = 7;
        int[] N = {10, 50, 100, 500, 1000, 5000, 10000};

        long[] n = {10, 50, 100, 500, 1000, 5000, 10000};
        long[] times = new long[size];
        long[] operations = new long[size];
        long[] comparisons = new long[size];

        for(int a = 0; a < 7; a++) {

            int out_lat = N[a];
            long[][] initial_matrix = CreateMatrix.createMatrix(out_lat, out_lat, -1);

            long start_time = System.nanoTime();
            long compar = 0;
            long opr = 0;

            int lateral = N[a];
            opr++;

            for (int i = 0; i < lateral; i++) {
                opr++;
                compar++;

                long[] new_row = new long[lateral];
                opr++;

                for (int j = 0; j < lateral; j++) {
                    opr++;
                    compar++;

                    new_row[j] = initial_matrix[j][i];
                    opr++;
                }
                assert (initial_matrix[i] == new_row);
                compar++;
            }

            long end_time = System.nanoTime();
            long elapsed_time = end_time - start_time;

            initial_matrix = null;
            System.gc();

            times[a] = elapsed_time;
            operations[a] = opr;
            comparisons[a] = compar;

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

        data = Repeater.repeater01(ex4::func, 5, 7);

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

        CsvExporter.write_csv("dadosMediosEx4.csv", string_array);

    }

}

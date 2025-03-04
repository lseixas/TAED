package Aula01ED;

import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex2 {

    public static ArrayList<long[]> func() {

        int n = 5;
        boolean t5 = false;
        long[] N = new long[10];
        long[] times = new long[10];
        long[] operations = new long[10];
        long[] comparisons = new long[10];
        int rowpt = 0;

        while (n < 500000) {

            if (t5) {
                n *= 5;
            } else {
                n *= 2;
            }
            t5 = !t5;

            ///

            long aritOp = 0;
            long compar = 0;

            long startTime = System.nanoTime();

            int[] array = new int[n];
            aritOp++;
            int[] copy_arr = new int[n];
            aritOp++;


            aritOp++;
            for (int i = 0; i < n; i++) {
                compar++;

                copy_arr[i] = array[i];
                aritOp++;
            }

            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            ///

            N[rowpt] = n;
            times[rowpt] = timeElapsed;
            operations[rowpt] = aritOp;
            comparisons[rowpt] = compar;

            rowpt++;

        }

        ArrayList<long[]> data = new ArrayList<>();

        data.add(N);
        data.add(times);
        data.add(operations);
        data.add(comparisons);

        return data;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<long[]> data = new ArrayList<>();

        data = Repeater.repeater01(ex2::func, 5, 10);

        data = TransforMatrix.transform_long(data);

        StringBuilder line = new StringBuilder();
        String[] string_array = new String[10];

        for(int i = 0; i < 10; i++) {
            line.setLength(0);
            for(int j = 0; j < 4; j++) {
                line.append(data.get(i)[j]).append(",");
            }
            string_array[i] = line.toString();
        }

        CsvExporter.write_csv("dadosMediosEx2.csv", string_array);

    }

}



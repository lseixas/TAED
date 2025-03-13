package Aula02ED;

import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex3_knuth {

    private static final int array_n_size = 6;
    private static final int repeat_times = 5;
    private static final int data_columns = 7;

    public static ArrayList<long[]> func() {

        int size = array_n_size;
        int[] N = {10, 50, 100, 500, 10000, 100};
        int[] M = {10, 75, 300, 200, 1, 1000};

        long[] n = {10, 50, 100, 500, 100000, 1000};
        long[] assignments = new long[10];
        long[] math_operation = new long[10];
        long[] comparisons = new long[10];
        long[] access = new long[10];
        long[] logic = new long[10];
        long[] statements = new long[10];

        for(int i = 0; i < size; i++) {

            int asg = 0;
            int math_op = 0;
            int compar = 0;
            int acc = 0;
            int log = 0;
            int stmt = 0;

            double[][] matrix = new double[N[i]][M[i]];
            asg++;
            acc+=2;

            asg++;
            stmt++;
            for(int row = 0; row < N[i]; row++) {
                compar++;
                math_op++;

                asg++;
                stmt++;
                for(int col = 0; col < M[i]; col++) {
                    compar++;
                    math_op++;

                    matrix[row][col] = -1;
                    acc++;
                    asg++;
                }
            }

            matrix = null;
            System.gc();

            assignments[i] = asg;
            math_operation[i] = math_op;
            comparisons[i] = compar;
            access[i] = acc;
            logic[i] = log;
            statements[i] = stmt;

        }

        ArrayList<long[]> data = new ArrayList<>();

        data.add(n);
        data.add(assignments);
        data.add(math_operation);
        data.add(comparisons);
        data.add(access);
        data.add(logic);
        data.add(statements);

        return data;

    }

    public static void main(String[] args) throws IOException {

        ArrayList<long[]> data = new ArrayList<>();

        data = Repeater.repeater_knuth(ex3_knuth::func, repeat_times, array_n_size);

        data = TransforMatrix.transform_long(data);

        StringBuilder line = new StringBuilder();
        String[] string_array = new String[array_n_size];

        for(int i = 0; i < array_n_size; i++) {
            line.setLength(0);
            for(int j = 0; j < data_columns; j++) {
                line.append(data.get(i)[j]).append(",");
            }
            string_array[i] = line.toString();
        }

        CsvExporter.write_csv_knuth("dadosMediosEx3Knuth.csv", string_array);

    }


}

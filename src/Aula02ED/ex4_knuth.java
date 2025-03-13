package Aula02ED;

import helpers.CreateMatrix;
import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex4_knuth {

    private static final int array_n_size = 7;
    private static final int repeat_times = 5;
    private static final int data_columns = 7;

    public static ArrayList<long[]> func() {

        int size = array_n_size;
        int[] N = {10, 50, 100, 500, 1000, 5000, 10000};

        long[] n = {10, 50, 100, 500, 1000, 5000, 10000};
        long[] assignments = new long[10];
        long[] math_operation = new long[10];
        long[] comparisons = new long[10];
        long[] access = new long[10];
        long[] logic = new long[10];
        long[] statements = new long[10];


        for(int a = 0; a < 7; a++) {

            int out_lat = N[a];
            long[][] initial_matrix = CreateMatrix.createMatrix(out_lat, out_lat, -1);

            int asg = 0;
            int math_op = 0;
            int compar = 0;
            int acc = 0;
            int log = 0;
            int stmt = 0;

            int lateral = N[a];
            asg++;

            asg++;
            stmt++;
            for (int i = 0; i < lateral; i++) {
                compar++;
                math_op++;

                long[] new_row = new long[lateral];
                asg++;

                asg++;
                stmt++;
                for (int j = 0; j < lateral; j++) {
                    compar++;
                    math_op++;

                    new_row[j] = initial_matrix[j][i];
                    asg++;
                    acc+=4;
                }
                assert (initial_matrix[i] == new_row);
                log++;
                compar++;
                acc+=3;
            }

            initial_matrix = null;
            System.gc();

            assignments[a] = asg;
            math_operation[a] = math_op;
            comparisons[a] = compar;
            access[a] = acc;
            logic[a] = log;
            statements[a] = stmt;

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

        data = Repeater.repeater_knuth(ex4_knuth::func, repeat_times, array_n_size);

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

        CsvExporter.write_csv_knuth("dadosMediosEx4Knuth.csv", string_array);

    }

}

package Aula02ED;

import helpers.CsvExporter;
import helpers.Repeater;
import helpers.TransforMatrix;

import java.io.IOException;
import java.util.ArrayList;

public class ex2_knuth {

    private static final int array_n_size = 10;
    private static final int repeat_times = 5;
    private static final int data_columns = 7;

    public static ArrayList<long[]> func() {

        int n = repeat_times;
        boolean t5 = false;
        long[] N = new long[10];
        long[] assignments = new long[10];
        long[] math_operation = new long[10];
        long[] comparisons = new long[10];
        long[] access = new long[10];
        long[] logic = new long[10];
        long[] statements = new long[10];
        int rowpt = 0;

        while (n < 500000) {

            if (t5) {
                n *= 5;
            } else {
                n *= 2;
            }
            t5 = !t5;

            ///

            int asg = 0;
            int math_op = 0;
            int compar = 0;
            int acc = 0;
            int log = 0;
            int stmt = 0;

            int[] array = new int[n];
            asg++;
            acc++;

            int[] copy_arr = new int[n];
            asg++;
            acc++;

            asg++;
            stmt++;
            for (int i = 0; i < n; i++) {
                compar++;
                math_op++;

                copy_arr[i] = array[i];
                asg+=2;
                acc+=2;

            }


            ///

            N[rowpt] = n;
            assignments[rowpt] = asg;
            math_operation[rowpt] = math_op;
            comparisons[rowpt] = compar;
            access[rowpt] = acc;
            logic[rowpt] = log;
            statements[rowpt] = stmt;

            rowpt++;

        }

        ArrayList<long[]> data = new ArrayList<>();

        data.add(N);
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

        data = Repeater.repeater_knuth(ex2_knuth::func, repeat_times, array_n_size);

        data = TransforMatrix.transform_long(data);

        StringBuilder line = new StringBuilder();
        String[] string_array = new String[10];

        for(int i = 0; i < array_n_size; i++) {
            line.setLength(0);
            for(int j = 0; j < data_columns; j++) {
                line.append(data.get(i)[j]).append(",");
            }
            string_array[i] = line.toString();
        }

        CsvExporter.write_csv_knuth("dadosMediosEx2Knuth.csv", string_array);

    }

}



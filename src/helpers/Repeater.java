package helpers;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Repeater {

    public static ArrayList<long[]> repeater01(Supplier<ArrayList<long[]>> method, int repeat_times, int N_limit) {

        ArrayList<long[]> N = new ArrayList<>();
        ArrayList<long[]> time = new ArrayList<>();
        ArrayList<long[]> operations = new ArrayList<>();
        ArrayList<long[]> comparisons = new ArrayList<>();

        for(int i = 0; i < repeat_times; i++) {

            System.gc();
            ArrayList<long[]> result = method.get();
            N.add(result.get(0));
            time.add(result.get(1));
            operations.add(result.get(2));
            comparisons.add(result.get(3));

        }

        long[] mean_time_array = new long[N_limit];
        long[] mean_operations_array = new long[N_limit];
        long[] mean_comparisons_array = new long[N_limit];

        long[] temp_time_array = new long[repeat_times];
        long[] temp_operations_array = new long[repeat_times];
        long[] tempo_comparisons_array = new long[repeat_times];

        for(int col = 0; col < N_limit; col++) {
            long mean;

            for(int row = 0; row < repeat_times; row++) {

                temp_time_array[row] = time.get(row)[col];
                temp_operations_array[row] = operations.get(row)[col];
                tempo_comparisons_array[row] = comparisons.get(row)[col];

            }

            mean_time_array[col] = Calculator.calculateMean(temp_time_array, repeat_times);
            mean_operations_array[col] = Calculator.calculateMean(temp_operations_array, repeat_times);
            mean_comparisons_array[col] = Calculator.calculateMean(tempo_comparisons_array, repeat_times);

        }

        ArrayList<long[]> return_array = new ArrayList<>();
        return_array.add(N.getFirst());
        return_array.add(mean_time_array);
        return_array.add(mean_operations_array);
        return_array.add(mean_comparisons_array);

        return return_array;

    }

}

package helpers;

import java.util.Arrays;

public class MeanCalculator {

    public static float calculateMean(int[] array, int size) {

        if(size == 0 || array.length == 0 || size != array.length) {
            return 0;
        }

        int sum = 0;

        for(int i = 0; i < size; i++) {
            sum += array[i];
        }

        return (float)(sum/size);

    }

}

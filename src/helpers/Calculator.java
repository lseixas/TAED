package helpers;

public class Calculator {

    public static long calculateMean(long[] array, int size) {

        if(size == 0 || array.length == 0 || size != array.length) {
            return 0;
        }

        long sum = 0;

        for(int i = 0; i < size; i++) {
            sum += array[i];
        }

        return (long)(sum/size);

    }

}

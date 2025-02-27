package helpers;

import java.util.ArrayList;

public class TransforMatrix {

    public static ArrayList<long[]> transform_long(ArrayList<long[]> array){

        int cols = array.getFirst().length;
        int rows = array.size();
        ArrayList<long[]> transposed = new ArrayList<>();

        for(int i = 0; i < cols; i++) {
            long[] new_row = new long[rows];
            for(int j = 0; j < rows; j++) {
                new_row[j] = array.get(j)[i];
            }
            transposed.add(new_row);
        }

        return transposed;

    }

}

package helpers;

public class CreateMatrix {

    public static long[][] createMatrix(int rows, int cols, long initialValue) {
        long[][] matrix = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = initialValue; // Set all elements to initialValue
            }
        }
        return matrix;
    }

}

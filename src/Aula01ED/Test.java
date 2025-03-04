package Aula01ED;

public class Test {

    public static void main(String[] args) {

        int rows = 200;
        int cols = 500;
        int initialValue = -1;

        long start = System.nanoTime();

        long[][] matrix = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = initialValue; // Set all elements to initialValue
            }
        }

        long end = System.nanoTime();

        System.out.println("Elapsed time: " + (end-start));

    }

}

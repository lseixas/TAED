package helpers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvExporter {

    public static void write_csv(String fileName, String[] dataRows) throws IOException {

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            writer.println("N,time,operations,comparisons");

            for(String row : dataRows) {
                writer.println(row);
            }

            System.out.println("CSV file generated successfully: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write_csv_knuth(String fileName, String[] dataRows) throws IOException {

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            writer.println("N,assignments,math_operation,comparisons,access,logic,statements");

            for(String row : dataRows) {
                writer.println(row);
            }

            System.out.println("CSV file generated successfully: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


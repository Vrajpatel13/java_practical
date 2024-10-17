import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "output.txt";

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text (type 'exit' to finish):");

            String input;
            while (!(input = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input);
                fileWriter.newLine();
            }

            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


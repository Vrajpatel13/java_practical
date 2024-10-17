import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical29 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java WordSearch <word> <filename>");
            return;
        }

        String searchWord = args[0];
        String fileName = args[1];
        Integer count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + searchWord + "' appears " + count + " times in " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
    }
}        


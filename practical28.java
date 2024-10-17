import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pra28 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCountInFileScanner <file-path> <character>");
            return;
        }

        String fileName = args[0];
        char targetChar = args[1].charAt(0);
        int count = 0;

        try {
            
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                for (char c : line.toCharArray()) {
                    if (c == targetChar) {
                        count++;
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
          
        }

        System.out.println("Character '" + targetChar + "' appears " + count + " times in the file.");
    }
}

import java.io.*;
import java.util.*;

public class pra27 {
    public static void main(String[] args) {

        for(String filename : args)
        {  
    int count = 0;
    

    try{
        File file = new File(filename);

    Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("File name:"+filename+" \nTotal Number of Lines: " + count);
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
      System.out.println("Error reading the file");
    }
  }
}
}

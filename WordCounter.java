import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana orange apple mango grape banana";
        
        Map<String, Integer> wordCountMap = new TreeMap<>();
        String[] words = text.split("\\s+");
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

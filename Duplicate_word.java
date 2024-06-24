
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_word {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> uniqueWords = new HashSet<>();
        
        System.out.println("Enter the number of words:");
        int n = sc.nextInt();
        
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            uniqueWords.add(word);  // HashSet returns true if word is added (i.e., it's unique)
                // Add to ArrayList only if it's unique
            
        }
        
        // Print the unique words in order
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}

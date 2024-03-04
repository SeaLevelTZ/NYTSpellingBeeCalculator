import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class FourLetter {
    public static ArrayList<String> makeList(){// throws FileNotFoundException 
        ArrayList<String> wordList = new ArrayList<>();
        
        try{
        Scanner scanner = new Scanner(new File("words.txt"));
        while(scanner.hasNextLine()){
            wordList.add(scanner.nextLine());
        }
        scanner.close();
        
    }catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      return wordList;
    }
    
}
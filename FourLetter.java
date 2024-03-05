import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class FourLetter {
    public static ArrayList<String> makeList(){
        ArrayList<String> wordList = new ArrayList<>();
        
        try{
        Scanner scanner = new Scanner(new File("words.txt"));
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (isValidWord(word)) {
                wordList.add(word);
        }
    }
        scanner.close();
        
    }catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      return wordList;
    }

private static boolean isValidWord(String str){
    if(str.length()<=3) 
    return false; 
    ArrayList<String> validLetter = new ArrayList<>();
    int count = 0;
        for(int i = 0; i<str.length(); i++){
            for(String x: validLetter){
                if(x.compareTo(str.substring(i, i+1))!=0)
                count++;
            }

        }
    if(count > 7)
    return false; 
    return true;
}
}
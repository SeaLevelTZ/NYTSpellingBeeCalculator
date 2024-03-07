import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wordList = makeList();

        Scanner scan = new Scanner(System.in);
        ArrayList<String> wordArr = new ArrayList<String>();
        System.out.print("Enter center letter: ");
        String a = scan.nextLine();
        System.out.print("Enter Other letters: ");
        String other6 = scan.nextLine();
        ArrayList<String> allWords = makeList();
        for (String i : allWords) {
            if ( hasCenter(a, i) && isInWord(other6, i, a)) {
                wordArr.add(i);
            }
        }
        System.out.println(wordArr.size() + " words found\n");
        System.out.println(wordArr);
    }

    private static boolean isInWord(String letters, String word, String center) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != center.charAt(0) && letters.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasCenter(String center, String word) {
        if (word.indexOf(center) == -1)
            return false;
        return true;
    }
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
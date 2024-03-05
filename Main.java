import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wordList = FourLetter.makeList();

        Scanner scan = new Scanner(System.in);
        ArrayList<String> wordArr = new ArrayList<String>();
        System.out.print("Enter center letter: ");
        String a = scan.nextLine();
        System.out.print("Enter Other letters: ");
        String other6 = scan.nextLine();
        ArrayList<String> allWords = FourLetter.makeList();
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
}
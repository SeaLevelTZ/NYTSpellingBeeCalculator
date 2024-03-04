import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class FourLetter {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> wordList = new ArrayList<>();
    Scanner scanner = new Scanner(new File("words.txt"));
    while(scanner.hasNextLine()){
        wordList.add(scanner.nextLine());
    }
    scanner.close();
}
}

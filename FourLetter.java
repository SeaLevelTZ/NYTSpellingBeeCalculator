import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class FourLetter {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(new File("words.txt"));
    while(scanner.hasNextLine()){
        list.add(scanner.nextLine());
    }
}
    /*more than 4 letters
    //more than 7 different charcters. 

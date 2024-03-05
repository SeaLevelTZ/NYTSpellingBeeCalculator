import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){

        ArrayList<String> wordList = FourLetter.makeList();

    	Scanner scan = new Scanner(System.in);
    	ArrayList<String> wordArr = new ArrayList<String>();
        String other6 = scan.nextLine();
        String a = scan.nextLine();
        ArrayList<String> allWords = FourLetter.makeList();
        for(String i : allWords){
            if(i.length()>3&&isInWord(a, i, 1) && isInWord(other6, i, 0)){
                wordArr.add(i);
            }
        }
        System.out.println(wordArr);
    }
    private static boolean isInWord(String letter, String word, int type){
        int count = 0;
        for(int i = 0;i<letter.length();i++){
            boolean isCounted = false;
            for(int j = 0; j<word.length();j++){
                if(!isCounted && word.substring(j, j+1).equals(letter.substring(i, i+1))){
                    count++;
                    isCounted = true;
                }
            }
        }
        if(type ==1){
            if(count==1) return true;
            else return false;
        }
        else{
            if(count==7) return true;
            else return false;
        }
    }
}
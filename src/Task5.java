import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task5 {
    public static void main(String[] args) {
        var string = "cook cucucmber cccar ccccccc";
        var letterCount = 0;
        var wordCount = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.compare(string.charAt(i), ' ') == 0) {
                letterCount = 0;
            } else {
                if (Character.compare(string.charAt(i), 'c') == 0) {
                    letterCount++;
                    if(letterCount == 3){
                        wordCount++;
                    }
                }
            }
        }
        System.out.println(wordCount);
    }
}
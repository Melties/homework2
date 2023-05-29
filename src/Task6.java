public class Task6 {
    public static void main(String[] args) {
        String string ="I love java because it's interesting";
        String[] word = string.split (" ");
        String longestWord = " ";
        for (int i=0; i < word.length; i++){
            if (word[i].length() >= longestWord.length()) {
                longestWord = word[i];
            }
        }
        System.out.println (longestWord);
    }
}

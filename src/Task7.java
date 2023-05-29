public class Task7 {
    public static void main(String[] args) {
        String string = "antilopa is gorgeous";
        int counter = 0;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if ((words[i].startsWith("a")) && (words[i].endsWith("a"))) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("В строке есть слова которые начинаются и заканчиваются на букву а");
        } else {
            System.out.println("в строке нет таких слов");
        }
    }
}
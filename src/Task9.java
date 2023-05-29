public class Task9 {
    public static void main(String[] args) {
        String string = "I love java";
        String word = "love";
        int index = 0;
        if (string.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("В строке есть слово");
            index = string.indexOf(word);
            System.out.println("С индексом " + index);
        } else {
            System.out.println("В строке слова нет");
        }
    }
}

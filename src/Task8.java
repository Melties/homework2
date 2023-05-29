import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task8 {
    public static void main(String[] args) {
        String ccPattern = "((?:(?:\\d{4}[- ]){3}\\d{4}|\\d{16}))(?![\\d])";
        Pattern pattern = Pattern.compile(ccPattern);
        Matcher matcher = pattern.matcher("Номер моей кредитной карты 1111-2222-3333-4444");
        if (matcher.find()) {
            System.out.println("Номер карты есть:");
            System.out.println(matcher.group(0));
        } else {
            System.out.println("Номера карты в строке нету");
        }
    }
}

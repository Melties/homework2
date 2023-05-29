public class Task1 {
    public static void main(String[] args) {
        int number = Month
                .valueOf("NOVEMBER")
                .getMonthNumber();
        System.out.println(number);
        System.out.println(Month.getMonthByNumber(12));
    }
}

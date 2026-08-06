public class CopyValueOfExample {
    public static void main(String[] args) {
        char[] ch = {'J', 'A', 'V', 'A'};

        String str = String.copyValueOf(ch);

        System.out.println(str);
    }
}

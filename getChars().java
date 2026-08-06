public class GetCharsExample {
    public static void main(String[] args) {
        String str = "Hello";

        char[] ch = new char[5];

        str.getChars(0, 5, ch, 0);

        System.out.println(ch);
    }
}

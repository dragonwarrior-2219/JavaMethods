public class GetBytesExample {
    public static void main(String[] args) {
        String str = "Java";

        byte[] b = str.getBytes();

        for (byte i : b) {
            System.out.print(i + " ");
        }
    }
}

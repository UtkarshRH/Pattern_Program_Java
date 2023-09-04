public class Program34 {
    public static void main(String args[]) {
        int n = 101;
        for (int i = n; i >= 97; i--) {
            for (int j = i; j >= 97; j--) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}

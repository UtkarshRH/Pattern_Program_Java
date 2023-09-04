public class Program23 {
    public static void main(String args[]) {
        int n = 101;
        for (int i = 97; i <= n; i++) {
            for (int j = i; j >= 97; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

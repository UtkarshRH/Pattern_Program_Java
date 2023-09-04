public class Program24 {
    public static void main(String args[]) {
        int n = 69;
        for (int i = n; i >= 65; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

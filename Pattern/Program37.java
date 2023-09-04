public class Program37 {
    public static void main(String args[]) {
        int n = 65;
        for (int i = n; i <= 69; i++) {
            for (int j = 69; j >= i; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

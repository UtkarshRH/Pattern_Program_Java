public class Program38 {
    public static void main(String args[]) {
        int n = 97;
        for (int i = 101; i >= n; i--) {
            for (int j = i; j >= 97; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

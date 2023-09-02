package JavaVibrant.Pattern;

public class Program10 {
    public static void main(String args[]) {
        int n = 97;
        for (int i = 101; i >= n; i--) {
            for (char j = 101; j >= n; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

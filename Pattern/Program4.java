package JavaVibrant.Pattern;

public class Program4 {
    public static void main(String args[]) {
        int n = 1;
        for (int i = 5; i >= n; i--) {
            for (int j = 5; j >= n; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

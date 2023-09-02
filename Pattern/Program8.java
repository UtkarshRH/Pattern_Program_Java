package JavaVibrant.Pattern;

public class Program8 {
    public static void main(String args[]) {
        char n = 97;
        for (char i = 101; i >= n; i--) { // 101>=97
            for (int j = 101; j >= n; j--) { // 101 >=97
                System.out.print(i); // it print e
            }
            System.out.println();
        }
    }
}

public class Program21 {
    public static void main(String[] args) {
        char n = 101;
        for (char i = n; i >= 97; i--) { // n = 101 i =101 100 99 98 97
            for (char j = n; j >= i; j--) { // j = 101 true false 101 100 99 99 99 98 98 98 98 97
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

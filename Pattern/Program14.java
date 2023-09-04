//WAP to print 1 to 5 in repeate order 

public class Program14 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) { // n = 5 i = 1 i = 2 i = 3
            for (int j = 1; j <= i; j++) { // j = 1 false j = 2 j = 3
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
 * -> Output:
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

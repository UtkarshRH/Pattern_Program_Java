//WAP to print the pyramid from number 5 to 1...

public class Program15 {
    public static void main(String args[]) {
        int n = 1;// here assign the n = 1
        for (int i = 5; i >= n; i--) { // here we assign thee i = 1 i=4 i = 3 i = 2 i = 1
            for (int j = 5; j >= i; j--) { // j = 5 j = 4 j = 4 j = 3 j = 3 j = 3 j = 2 j = 2 j = 2 j = 2 j = 1 j= 1 j=
                                           // 1 j= 1 j= 1
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
 * Output
 * 5
 * 44
 * 333
 * 2222
 * 11111
 */

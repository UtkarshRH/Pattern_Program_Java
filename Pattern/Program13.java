//WAP to print Pyramid using star(*)...

public class Program13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {// int n = 5 i = 1
            for (int j = 1; j <= i; j++) { //
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
 * -> Output:
 * 
 * *
 * * *
 * * * *
 * * * * *
 */
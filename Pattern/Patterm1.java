//WAP to print 5*5 star pattern  

package JavaVibrant.Pattern;

public class Patterm1 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { // i = 1
            for (int j = 1; j <= 5; j++) { // j = 1
                for (int k = 1; k <= 5; k++) { // k = 1
                    for (int l = 1; l <= 5; l++) { // l=1,l=2,l=3,l=4,l=5. ----->Utkarsh<-----
                        System.out.print(" * "); // Print The star.. till condition become false.
                    }
                    System.out.print("\t\t"); // k = 1,k = 2,k = 3,k = 4,k = 5. Next Tab
                }
                System.out.println(); // Next Line
            }
            System.out.println(); // Next line
        }
    }
}

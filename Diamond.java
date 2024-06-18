import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // test cases
        int t = sc.nextInt();

        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();

            int upperRow = n / 2 + 1;
            int lowerRow = n / 2;

            int space = n - 1;
            int stars = 1;

            // Upper part of diamond
            for (int i = 1; i <= upperRow; i = i + 1) {

                for (int j = 1; j <= space; j = j + 1) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j = j + 1) {
                    System.out.print("* ");
                }
                System.out.println();

                stars = stars + 2;
                space = space - 2;
            }
            stars = n -2;
            space = 2;

            // Lower part of Diamond
            for (int i = 1; i <= lowerRow; i = i + 1) {
                for (int j = 1; j <= space; j = j + 1) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j = j + 1) {
                    System.out.print("* ");
                }
                System.out.println();

                stars = stars - 2;
                space = space + 2;
            }
        }
    }
}

import java.util.*;
import java.util.Scanner;

// we can write top down solution easily from recursive solution 
// Base condition became initialization part.
public class lcs_topdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings:-");
        String x = sc.nextLine();
        String y = sc.nextLine();
        int n = x.length();
        int m = y.length();
        int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            t[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }
        System.out.println(t[n][m]);
    }
}

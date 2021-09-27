import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class KnuthMorrisPratt {
    public static int[] kmpPrefix(String P) {
        int m = P.length();
        int[] table = new int[m];
        table[0] = 0;
        int k = 0;
        for (int q = 1; q < m; q++) {
            while (k > 0 && P.charAt(k) != P.charAt(q)) {
                k = table[k - 1];
            }
            if (P.charAt(k) == P.charAt(q)) {
                k++;
            }
            table[q] = k;
        }
        return table;
    }
    
    public static int match(String P, String T) {
        int n = T.length(), m = P.length();
        int[] prefixTable = kmpPrefix(P);
        int q = 0;
        for (int i = 0; i < n; i++) {
            while (q > 0 && P.charAt(q) != T.charAt(i)) {
                    q = prefixTable[q - 1];
            }
            if (P.charAt(q) == T.charAt(i)) {
                q++;
            }
            if (q == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a base string: ");
        String T = keyboard.nextLine();
        System.out.print("Enter search string: ");
        String P = keyboard.nextLine();
        System.out.println("The first index at which string P appears in string T is: " + match(P, T));
        keyboard.close();
    }    
}

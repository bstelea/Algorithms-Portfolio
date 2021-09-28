import java.util.Scanner;

public class Naive {
    public static int match(String P, String T) {
        int n = T.length();
        int m = P.length();
        for (int i = 0; i <= n - m; i++) {
            boolean sem = true;
            for (int j = 0; j < m; j++) {
                if (P.charAt(j) != T.charAt(i + j)) {
                    sem = false;
                    continue;
                }
            }
            if (sem) {
                return i;
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

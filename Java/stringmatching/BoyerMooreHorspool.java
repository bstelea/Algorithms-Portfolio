import java.util.Scanner;

public class BoyerMooreHorspool {
    public static int match(String P, String T) {
        int n = P.length();
        int m = T.length();
        int pointer1 = 0, pointer2;
        while (pointer1 <= m - n) {
            pointer2 = n - 1;
            boolean pointer1Inc = false;
            while (pointer2 >= 0) {
                if (P.charAt(pointer2) != T.charAt(pointer1 + pointer2)) {
                    if (P.contains(Character.toString(T.charAt(pointer1 + pointer2)))) {
                        pointer1 += n - P.lastIndexOf(Character.toString(T.charAt(pointer1 + pointer2))) - 1;
                    } else {
                        pointer1 += n;
                    }
                    pointer1Inc = true;
                    break;
                } else {
                    pointer2--;
                }
            } 
            if (pointer2 == -1) {
                return pointer1;
            } else {
                pointer1 += (pointer1Inc) ? 0 : n;
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
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        String s6 = "]";

        if (sol.isValid(s1)) {
            System.out.println("Test1 passed!");
        } else {
            System.out.println("Test1 failed!");
        }

        if (sol.isValid(s2)) {
            System.out.println("Test2 passed!");
        } else {
            System.out.println("Test2 failed!");
        }

        if (!sol.isValid(s3)) {
            System.out.println("Test3 passed!");
        } else {
            System.out.println("Test3 failed!");
        }

        if (!sol.isValid(s4)) {
            System.out.println("Test4 passed!");
        } else {
            System.out.println("Test4 failed!");
        }

        if (sol.isValid(s5)) {
            System.out.println("Test5 passed!");
        } else {
            System.out.println("Test5 failed!");
        }

        if (!sol.isValid(s6)) {
            System.out.println("Test6 passed!");
        } else {
            System.out.println("Test6 failed!");
            System.out.println("Test6 is " + sol.isValid(s6));
        }
        
    }
}

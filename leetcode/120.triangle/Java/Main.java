import java.util.Arrays;
import java.util.List;

public class Main {

    public static void test(Solution solution) {
        List<List<Integer>> triangle1 = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
        List<List<Integer>> triangle2 = Arrays.asList(Arrays.asList(-10));
        if (solution.minimumTotal(triangle1) == 11) {
            System.out.println("Test 1 passed!");
        } else {
            System.out.println("Test 1 failed!");
        }
        if (solution.minimumTotal(triangle2) == -10) {
            System.out.println("Test 2 passed!");
        } else {
            System.out.println("Test 2 failed!");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }
}

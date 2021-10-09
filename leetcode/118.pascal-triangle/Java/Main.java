import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printList(List<List<Integer>> list) {
        for (List<Integer> l : list) {
            System.out.print(l.toString() + " ");
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        printList(solution.generate(5));
    }
}

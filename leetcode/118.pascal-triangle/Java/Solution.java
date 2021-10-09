import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        res.add(sub);
        if (numRows == 1)
            return res;

        for (int i = 1; i < numRows; i++) {
            sub = new ArrayList<>();
            sub.add(1);
            for (int j = 1; j < i; j++) {
                System.out.println("i is: " + i + ", and j is: " + j);
                sub.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            sub.add(1);
            res.add(sub);
        }
        return res;
    }
}

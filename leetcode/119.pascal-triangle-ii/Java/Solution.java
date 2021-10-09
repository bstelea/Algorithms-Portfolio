import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int aux, prev;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 0; i < rowIndex; i++) {
            prev = 1;
            for (int j = 0; j < i; j++) {
                aux = res.get(j + 1);
                res.set(j + 1, prev + aux);
                prev = aux;
            }
            res.add(1);
        }
        return res;
    }
}

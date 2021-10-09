import java.util.ArrayList;
import java.util.List;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        
        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

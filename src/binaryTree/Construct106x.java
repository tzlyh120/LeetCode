package binaryTree;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yihan
 * @date 9/19/2023 - 3:09 PM
 */
public class Construct106x {
    static int postIndex;
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        dfs(buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}));
    }


    public static void dfs(TreeNode root){
        if(root!=null){
            dfs(root.left);
            System.out.println(root.val);
            dfs(root.right);
        }
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(postorder, 0, inorder.length - 1);

    }

    public static TreeNode buildTree(int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postIndex--]);
        System.out.println(root.val);

        // postorder从后向前取值，先取到的是右子树的值，所以root.right 需要先写；
        root.right = buildTree(postorder, map.get(root.val) + 1, right);
        root.left = buildTree(postorder, left, map.get(root.val) - 1);
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
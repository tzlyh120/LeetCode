package binaryTree;

/**
 * @author Yihan
 * @date 9/19/2023 - 4:32 PM
 */
public class BuildTree {



    public TreeNode build(int[] arr){
        TreeNode root = new TreeNode(arr[0]);
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
package binaryTree;


/**
 * @author Yihan
 * @date 9/19/2023 - 1:22 AM
 */
public class ConstructBTfromInPost106 {
    public static void main(String[] args) {
        dfs(buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}));
    }
    public static Node buildTree(int[] inorder, int[] postorder) {
        return backtrack(inorder,postorder,0,postorder.length-1);
    }

    public static Node backtrack(int[] inorder,int[] postorder,int l,int r){
        if(l==r) return new Node(postorder[l]);
        Node root = new Node(postorder[r]);
        int index = 0;
        for(int i=l;i<=r;i++){
            if(inorder[i]==root.val){
                index = i;
            }
        }
        if(l<=index-1){
            root.left = backtrack(inorder,postorder,l,index-1);
        }
        if(index+1<=r-1){
            root.right = backtrack(inorder,postorder,index,r-1);
        }
        return root;
    }

    public static void dfs(Node root){
        if(root==null){
            return;
        }
        dfs(root.left);
        System.out.println(root.val+" ");
        dfs(root.right);
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


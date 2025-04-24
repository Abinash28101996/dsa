package dsa.counttreenodes;

public class CountTreeNode {
    private int count = 0;
    public int countTreeNode(TreeNode root) {
        if(root == null) return count;
        count += 1;
        countTreeNode(root.left);
        countTreeNode(root.right);
        return count;
//        if (root == null) {return 0;}
//        return 1 + countTreeNode(root.left) + countTreeNode(root.right);
    }
}

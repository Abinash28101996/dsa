package dsa.inordertreetraversal;

import java.util.ArrayList;
import java.util.List;

public class InOrderTreeTraversal {
    List<Integer> inOrder = new ArrayList<Integer>();
    public InOrderTreeTraversal(TreeNode root) {
        inOrderTraversal(root);
        printTree();
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrder.add(root.val);
        inOrderTraversal(root.right);
    }

    private void printTree() {
        for (Integer i : inOrder) {
            System.out.print(i + " ");
        }
    }
}

package dsa.inordertreetraversal;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(9);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.left = n5;
        n3.right = n6;
        InOrderTreeTraversal inOrderTreeTraversal = new InOrderTreeTraversal(n1);
        InOrderTraversalUsingStack inOrderTraversalUsingStack = new InOrderTraversalUsingStack();
        List<Integer> integers = inOrderTraversalUsingStack.inorderTraversalUsingStack(n1);
        System.out.println(integers);

    }
}

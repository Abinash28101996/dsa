package dsa.inordertreetraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversalUsingStack {
    List<Integer> list;
    Stack<TreeNode> stack;
    public InOrderTraversalUsingStack() {
        list = new ArrayList<Integer>();
        stack = new Stack<>();
    }
    public List<Integer> inorderTraversalUsingStack(TreeNode root) {
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }
}

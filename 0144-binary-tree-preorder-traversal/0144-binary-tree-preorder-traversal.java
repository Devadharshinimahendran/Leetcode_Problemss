import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result; // Edge case: Empty tree
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root); // Start with root node
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop(); // Pop the top node
            result.add(node.val);  // Visit the node
            
            // Push right child first, so that left is processed first
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        
        return result;
    }
}
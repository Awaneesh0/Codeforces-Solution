/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Use a LinkedList so we can efficiently insert at the front in O(1) time
        LinkedList<Integer> result = new LinkedList<>();
        
        // Base case: empty tree
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            
            // Add the current node's value to the FRONT of the list
            result.addFirst(current.val);
            
            // Push left child FIRST (so it is processed last, ending up at the front of the list)
            if (current.left != null) {
                stack.push(current.left);
            }
            
            // Push right child SECOND
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        
        return result;
    }
}
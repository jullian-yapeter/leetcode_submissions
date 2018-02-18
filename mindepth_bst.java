/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    int count = 1;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        q.add(root);
        TreeNode levelEnd = root;
        while(!q.isEmpty()){
            if (root.left==null && root.right==null) return count;
            if (root.left!=null) q.add(root.left);
            if (root.right!=null) q.add(root.right);
            if (root==levelEnd){
                count++;
                levelEnd = (root.right==null) ? (root.left) : (root.right);
            }
            root = q.poll();
        }
        return count;
    }
}

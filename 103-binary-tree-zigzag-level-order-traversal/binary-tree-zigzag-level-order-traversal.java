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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null){
            List<List<Integer>> a = new ArrayList<>();
            return a;
        }
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean l= true;

        while (q.size()>0) {
            int size = q.size();
            List<Integer> a = new ArrayList<>();
            while(size-->0){
            TreeNode curr = q.poll();
            if(l)a.add(curr.val);
            else a.addFirst(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            level.add(a);
            l=!l;
        }
        
        return level;
    }
}
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
    public void pre(TreeNode node,List<TreeNode>ls){
        if(node == null)return;
        ls.add(node);
        pre(node.left,ls);
        pre(node.right,ls);
    }
    public void flatten(TreeNode root) {
        if(root== null) return;
        List<TreeNode> ls = new ArrayList<>();
        pre(root,ls);
        for(int i =0;i<ls.size()-1;i++){
            TreeNode temp = ls.get(i);
            temp.left = null;
            temp.right = ls.get(i+1);
        }
        ls.get(ls.size()-1).right=null;
        
    }
}
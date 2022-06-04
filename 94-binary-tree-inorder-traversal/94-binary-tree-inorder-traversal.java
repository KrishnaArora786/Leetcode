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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
       
        Stack<TreeNode> s= new Stack<>();
        
        TreeNode curr=root;
        while(true)
        {
            if(curr!=null)
            {
                s.add(curr);
                curr=curr.left;
            }
            
            else
            {
                if(s.isEmpty()==true)
                {
                    break;
                }
                
                curr=s.pop();
                list.add(curr.val);
                curr=curr.right;
            }
        }
        return list;
    }
}
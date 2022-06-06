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
    
    
	public static Stack<Integer> similar(TreeNode root,Stack<Integer> s)
	{
		
		if(root==null) return null;
		
		if(root!=null && root.left==null &&root.right==null)
		{
			s.add(root.val);
			
		}
		
		
		similar(root.left,s);
		similar(root.right,s);
		return s;
		
		
		
	}
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> s1= new Stack<>();
         Stack<Integer> s2= new Stack<>();
        
       similar(root1,s1);
        similar(root2,s2);
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
    }
}
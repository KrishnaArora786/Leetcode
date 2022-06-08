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
    public int findSecondMinimumValue(TreeNode root) {
        int val=Integer.MAX_VALUE;
        int count=0;
		if(root==null) return -1;
		if(root.left==null && root.right==null)
			
			return -1;
		Queue<TreeNode> q= new LinkedList();
		if(root.left!=null && root.right!=null)
		{
			q.add(root.left);
			q.add(root.right);
		}else if(root.left==null)
		{
			q.add(root.right);
		}else if(root.right==null)
		{
			q.add(root.left);
		}else
		{
			return -1;
		}
		
		
		while(q.isEmpty()==false)
		{
			int len=q.size();
			
			for(int i=0;i<len;i++)
			{
				TreeNode curr=q.poll();
				if(curr.val!=root.val)
                {
                    val=Math.min(val, curr.val);
                    count++;
                }
				
				
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				
				
			}
		}
        if(count>0)
        {
            return val;
        }
		return -1;
        
    }
}
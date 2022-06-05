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
    public List<Double> averageOfLevels(TreeNode root) {
        
        double a=0.0;
		ArrayList<Double> list = new ArrayList<>();
		if(root==null)return list;
		
		Queue<TreeNode> q= new LinkedList();
		q.add(root);
		
		while(q.isEmpty()==false)
		{
			a=0;
			int len =q.size();
			for(int i=0;i<len;i++)
			{
				TreeNode curr=q.poll();
				a+=curr.val;
				
				if(curr.left!=null)
				{
					q.add(curr.left);
					
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
			}
			list.add(a/len);
			
					
		}
		return list;
        
    }
}
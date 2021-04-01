/************************************************************

    Following is the Tree node structure
	
	class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

************************************************************/

public class Solution {
    public static long max=-1;
	public static long findMaxSumPath(TreeNode root) 
    {
		// Write your code here
        max=-1;
        find(root);
        return max;
	}
    public static long find(TreeNode root)
    {
        if(root==null)
        {
            return -1;
        }
        long lft=find(root.left);
        long rght=find(root.right);
        if(lft!=-1&&rght!=-1)
        {
            long s=lft+root.data+rght;
            if(s>max)
            {
                max=s;
            }
            return Math.max(root.data+lft,root.data+rght);
        }
        else if(lft==-1&&rght==-1)
        {
            return root.data;
        }
        else if(lft==-1&&rght!=-1)
        {
            return rght+root.data;
        }
        else
        {
            return root.data+lft;
        }
        
    }
}

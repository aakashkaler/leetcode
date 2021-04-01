/****************************************

Following is the BinaryTreeNode class structure

class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

****************************************/

public class Solution {
    public static int res=0;
    public static int longestUnivaluePath(BinaryTreeNode root)
    {
        res=0;
        longestUnivaluePath1(root);
        return res;
    }
	public static int longestUnivaluePath1(BinaryTreeNode root)
    {
		if(root==null)
        {
            return 0;
        }
        
        int lft=longestUnivaluePath1(root.left);
        int rght=longestUnivaluePath1(root.right);
        int leftc=0,rightc=0;
        if(root.left==null&&root.right==null)
        {
  
        }
        else if(root.left==null)
        {
            if(root.right.data==root.data)
            {
                rightc=rght+1;
            }
            
        }
        else if(root.right==null)
        {
            if(root.left.data==root.data)
            {
                leftc=lft+1;
            }
            
        }
        else
        {
            if(root.left.data==root.data)
            {
                leftc=lft+1;
            }
            if(root.right.data==root.data)
            {
                rightc=rght+1;
            }
          }
          res=Math.max(res,leftc+rightc);
        //System.out.println(res+"  "+leftc+"  "+rightc);
        return Math.max(leftc,rightc);
        
    }
}

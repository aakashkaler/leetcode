

/*******************************************************
Following is the BinaryTreeNode class structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*******************************************************/

public class Solution
{    
    public static long sum=0;
	public static long leftSum(BinaryTreeNode<Integer> root) 
	{
        /* 
		  Your class should be named Solution.
	 	  Read input as specified in the question.
	 	  Print output as specified in the question.
		*/
        sum=0;
        find(root,'f');
        return sum;
       
    }
    public static long find(BinaryTreeNode<Integer> root,char c)
    {
        if(root==null)
        {
            return 0;
        }
          find(root.left,'L');
           find(root.right,'R');
        
        if(c=='L')
        {
            sum=sum+root.data;
        }
        return sum;
    }

}

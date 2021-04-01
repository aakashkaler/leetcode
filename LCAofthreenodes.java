
/*
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*/

public class Solution {
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        
        // Write your code here.
        BinaryTreeNode<Integer> f=find(root,node1,node2);
        return find(root,node3,f.data);
    }
    public static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer> root, int node1,int node2)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==node1||root.data==node2)
        {
            return root;
        }
        BinaryTreeNode<Integer> ans1=find(root.left,node1,node2);
        BinaryTreeNode<Integer> ans2=find(root.right,node1,node2);
        if(ans1==null&&ans2==null)
        {
            return null;
        }
        else if(ans1==null&ans2!=null)
        {
            return ans2;
        }
         else if(ans1!=null&&ans2==null)
         {
             return ans1;
         }
        else
        {
            return root;
        }
    }
}

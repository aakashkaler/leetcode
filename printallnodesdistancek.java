/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
   public static ArrayList<Integer> aa=new ArrayList<Integer>();
    public static ArrayList<Integer> kDistance(TreeNode<Integer> root, int target, int k)
    {
        //    Write your code here.
         aa=new ArrayList<Integer>();
        find(root,target,k);
        return aa;
    }
    public static int find(TreeNode<Integer> root, int target, int k)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==target)
        {
            print(root,k);
            return k-1;
        }
        int lft=find(root.left,target,k);
        int rght=find(root.right,target,k);
        if(lft!=-1)
        {
            if(lft==0)
            {
                aa.add(root.data);
                return -1;
            }
            else
            {
                print(root.right,lft-1);
              return lft-1;
            }
        }
        else if(rght!=-1)
        {
            if(rght==0)
            {
                aa.add(root.data);
                return -1;
            }
            else
            {
                print(root.left,rght-1);
                return rght-1;
            }
        }
        return -1;
    }
    public static void print(TreeNode<Integer> root,int k)
    {
        if(root==null)
        {
            return ;
        }
        if(k==0)
        {
            aa.add(root.data);
        }
        print(root.left,k-1);
        print(root.right,k-1);
    }
}

import java.util.*;
public class Solution {
	public static int maximumZeroOneDistance(int matrix[][], int N, int M) 
    {
		// Write your code here
        int [][]visited=new int[N][M];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    max=Math.max(max,find(matrix,visited,i,j,N,M));
                }
            }
        }
        return max;
	}
    public static int find(int[][] matrix,int[][] visited,int i,int j,int N,int M)
    {
        Queue<qitem> q=new LinkedList<>();
        q.add(new qitem(i,j,0));
        while(!q.isEmpty())
        {
            qitem t=q.remove();
            if(matrix[t.row][t.col]==1)
            {
                return t.dist;
            }
            visited[i][j]=1;
            if(issafe(matrix,visited,N,M,t.row+1,t.col))
            {
               q.add(new qitem(t.row+1,t.col,t.dist+1));
            }
            if(issafe(matrix,visited,N,M,t.row-1,t.col))
            {
               q.add(new qitem(t.row-1,t.col,t.dist+1));
                
            }
            if(issafe(matrix,visited,N,M,t.row,t.col+1))
            {
               q.add(new qitem(t.row,t.col+1,t.dist+1));
                
            }
            if(issafe(matrix,visited,N,M,t.row,t.col-1))
            {
               q.add(new qitem(t.row,t.col-1,t.dist+1));
               
            }
            visited[i][j]=0;
        }
        return -1;
    }
    public static boolean issafe(int matrix[][],int[][] visited,int n,int m,int i,int j)
    {
        if(i>=0&&i<n&&j>=0&&j<m&&visited[i][j]!=1)
        {
            return true;
        }
        return false;
    }
    
}
class qitem
{
    int row;
    int col;
    int dist;
    public qitem(int r,int c,int d)
    {
        row=r;
        col=c;
        dist=d;
    }
}

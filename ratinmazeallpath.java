import java.util.ArrayList;

public class Solution {
   public static ArrayList<ArrayList<Integer>> ff=new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n)
    {
        // write your code here
        int visited[][]=new int[n][n];
        find(maze,n,0,0,visited);
        return ff;
    }
    public static void find(int[][] maze,int n,int i,int j,int[][] visited)
    {
        visited[i][j]=1;
        if(i==n-1&&j==n-1)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int k=0;k<n;k++)
            {
                for(int l=0;l<n;l++)
                {
                    a.add(visited[k][l]);
                }
            }
            ff.add(a);
           
        }
        if(i+1<n&&visited[i+1][j]==0&&maze[i+1][j]!=0)
        {
            find(maze,n,i+1,j,visited);
        }
         if(j+1<n&&visited[i][j+1]==0&&maze[i][j+1]!=0)
        {
            find(maze,n,i,j+1,visited);
        }
         if(i-1>=0&&visited[i-1][j]==0&&maze[i-1][j]!=0)
        {
            find(maze,n,i-1,j,visited);
        }
         if(j-1>=0&&visited[i][j-1]==0&&maze[i][j-1]!=0)
        {
            find(maze,n,i,j-1,visited);
        }
        visited[i][j]=0;
        return;
        
    }
    
}

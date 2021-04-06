
import java.util.*;

public class Solution 
{

	public static int covidSpread(ArrayList<ArrayList<Integer>> houses) 
	{
		//	  Write your code here.
        int n=houses.size();
        int m=houses.get(0).size();
        int i=0,j=0,max=0;
        int [][]visited=new int[n][m];
        Queue<pair> qq=new LinkedList<>();
        for(ArrayList<Integer> a:houses)
        {
            j=0;
            for(int x:a)
            {
//                 System.out.println(i+" "+j);
                if(x==2&&visited[i][j]!=1)
                {
                  qq.add(new pair(i,j));   
                }
                j++;
            }
            i++;
        }
        max=find(houses,visited,qq,n,m);
        int f=1;
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<m;l++)
            {
                if(houses.get(k).get(l)==1)
                {
                    if(visited[k][l]!=1)
                    {
                        f=0;
                        break;
                    }
                }
            }
        }
        if(f==1)
        {
        return max-1;
        }
        else
        {
            return -1;
        }
	}
    public static int find(ArrayList<ArrayList<Integer>> houses,int [][]visited,Queue<pair> qq,int n,int m)
    {
         int distance=0;
        while(!qq.isEmpty())
        {
           int qsize=qq.size();
       
        while(qsize-->0)
        {
            pair t=qq.remove();
           
            
            if(issafe(t.i+1,t.j,houses,visited,n,m))
            {
               
                qq.add(new pair(t.i+1,t.j));
                 visited[t.i+1][t.j]=1;
            }
            if(issafe(t.i,t.j+1,houses,visited,n,m))
            {
                
                qq.add(new pair(t.i,t.j+1));
                visited[t.i][t.j+1]=1;
            }
            if(issafe(t.i-1,t.j,houses,visited,n,m))
            {
                
                qq.add(new pair(t.i-1,t.j));
                visited[t.i-1][t.j]=1;
            }
            if(issafe(t.i,t.j-1,houses,visited,n,m))
            {
                
                qq.add(new pair(t.i,t.j-1));
                visited[t.i][t.j-1]=1;
            }
        }
            distance++;
//             System.out.println(distance);
        }
        return distance;
    }
    public static boolean issafe(int i,int j,ArrayList<ArrayList<Integer>> houses,int [][]visited,int n,int m)
    {
//         System.out.println(i+" "+j);
        if(i>=0&&j>=0&&i<n&&j<m&&visited[i][j]!=1&&houses.get(i).get(j)==1)
        {
            return true;
        }
        return false;
    }
}
class pair
{
    int i;
    int j;
    
    pair(int r,int c)
    {
        i=r;
        j=c;
    
    }
}

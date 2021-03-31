public class Solution {
    public static int maxGoldCollected(int[][] mine, int n, int m) 
    {
       // Write your code here
       int storage[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            storage[i][0]=mine[i][0];
        }
        for(int j=1;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    storage[i][j]=Math.max(mine[i][j]+storage[i][j-1],mine[i][j]+storage[i+1][j-1]);
                }
                else if(i==n-1)
                {
                    storage[i][j]=Math.max(mine[i][j]+storage[i][j-1],mine[i][j]+storage[i-1][j-1]);
                }
                else
                {
                    storage[i][j]=Math.max(mine[i][j]+storage[i][j-1],Math.max(mine[i][j]+storage[i-1][j-1],mine[i][j]+storage[i+1][j-1]));
                }
            }
        }
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 System.out.print(storage[i][j]+"  ");
//             }
//             System.out.println();
//         }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(storage[i][m-1]>max)
            {
                max=storage[i][m-1];
            }
        }
        return max;
    }
//     public static int max=0;
//     public static int maxGoldCollected(int[][] mine, int n, int m) 
//     {
//        // Write your code here
       
//         int ma=0;
//         int visited[][]=new int[n][m];
//         for(int i=0;i<n;i++)
//         {
//              max=0;
//             find(mine,n,m,i,0,0,visited);
//                 if(max>ma)
//                 {
//                     ma=max;
//                 }
//         }
//         return ma;
        
//     }
//     public static void find(int[][] mine,int n,int m,int i,int j,int sum,int[][] visited)
//     {
        
// //         System.out.println(i+"  "+j);
//         if(j==m-1)
//         {
// //             System.out.println();
// //             System.out.println(sum+"fffffffffffff");
// //             System.out.println();
//            sum= sum+mine[i][j];
//             if(sum>max)
//             {
//             max=sum;
//             }
//             return ;
//         }
//         visited[i][j]=1;
//         if(i+1<n&&j+1<m&&visited[i+1][j+1]!=1&&mine[i+1][j+1]!=0)
//         {
//         find(mine,n,m,i+1,j+1,sum+mine[i][j],visited);
//         }
//         if(j+1<m&&visited[i][j+1]!=1&&mine[i][j+1]!=0)
//         {
//         find(mine,n,m,i,j+1,sum+mine[i][j],visited);
//         }
//         if(i-1>=0&&j+1<m&&visited[i-1][j+1]!=1&&mine[i-1][j+1]!=0)
//         {
//         find(mine,n,m,i-1,j+1,sum+mine[i][j],visited);
//         }
//         visited[i][j]=0;
//     }
}



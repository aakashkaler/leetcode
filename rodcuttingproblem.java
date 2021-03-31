


public class Solution {

	public static int cutRod(int price[], int n) 
    {

		// Write your code here
        int storage[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                {
                    storage[i][j]=0;
                }
                else if(j>=i)
                {
                    storage[i][j]=Math.max(storage[i-1][j],price[i-1]+storage[i][j-i]);
                }
                else
                {
                    storage[i][j]=storage[i-1][j];
                }
            }
        }
//         for(int i=0;i<=n;i++)
//         {
//             for(int j=0;j<=n;j++)
//             {
//                 System.out.print(storage[i][j]+"  ");
//             }
//             System.out.println();
//         }
            return storage[n][n];
        
        
	}

}

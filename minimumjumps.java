import java.util.Arrays;

public class Solution {
//     public static int min=Integer.MAX_VALUE;
    public static int minimumJumps(int[] arr, int N) 
    {
         if(N<=0)
        {
            return -1;
        }
        else if(N==1)
        {
            return 0;
        }
        int storage[]=new int[N];
        storage[0]=0;
        for(int i=1;i<N;i++)
        {
            storage[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=(i+arr[i]);j>0;j--)
            {
                if(j<N)
                {
                    if(storage[j]>storage[i]+1)
                    {
                        storage[j]=storage[i]+1;
                    }
                }
            }
        }
        if(storage[N-1]>0&&storage[N-1]<200000000)
        {
        return storage[N-1];
        }
        else
        {  
            return -1;
        }
        
        // Write your code here
//         min=Integer.MAX_VALUE;
//         if(N<=0)
//         {
//             return -1;
//         }
//         else if(N==1)
//         {
//             return 0;
//         }
//         find(arr,N,0,0,N);
//         //System.out.println(N);
//            if(min!=Integer.MAX_VALUE)
//            {
//             return min;
//            }
//           else
//           {
//               return -1;
//           }
    }
//     public static void find(int[] arr,int n,int i,int step,int left)
//     {
       
//         if(i==n-1)
//         {
//            // System.out.println(step+"a");
          
//             if(min>step)
//             {
//                 min=step;
//             }
//             return ;
//         }
//         for(int j=arr[i];j>0;j--)
//         {
           
//             if(j<left)
//             {
//                 // System.out.println(arr[i]+"  "+j+"    "+i);
//                 find(arr,n,i+j,step+1,left-j);
//             }
//         }
//     }
}

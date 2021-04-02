import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) 
	{
	    int min=input.size()+1;
        int s=0;
        int count=-1;
        int start=0;
        int end=0;
		ArrayList<Integer> a=new ArrayList<>();
        while(end<input.size())
        {
            while(s<=sum&&end<input.size())
            {
                s=s+input.get(end);
              //  System.out.println(s);
                end++;
            }
            while(s>sum&&start<end)
            {
                
                if(end-start<min)
                {
                    min=end-start;
                    count=start;
                }
                s=s-input.get(start);
                start++;
            }
        }
        ///System.out.println(count+" "+min);
        if(count!=-1)
        {
            for(int i=count;i<count+min;i++)
            {
               // System.out.println(input.get(i));
                a.add(input.get(i));
            }
            return a;
            
        }
        return a;

	}
}

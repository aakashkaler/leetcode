import java.util.*;
public class Solution {

	public static int firstMissing(int[] arr, int n)
    {
		HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:arr)
        {
            if(x>0)
            m.put(x,0);
        }
      //  System.out.println(m.size()+"a");
        for(int i=1;i<=m.size()+1;i++)
        {
            if(m.containsKey(i))
            {
                continue;
            }
            else
            {
                return i;
            }
        }
        return n+1;
	}

}

import java.util.*;
public class Solution {
    public static List<String> findPermutations(String S) 
    {
        // Write your code here!
      if(S.length()==0)
      {
          List<String> arr=new ArrayList<String>();
          arr.add("");
          return arr;
      }
          List<String> smallans=findPermutations(S.substring(1));
          List<String> output=new ArrayList<>();
        char ch=S.charAt(0);
        for(String x:smallans)
        {
            for(int i=0;i<=x.length();i++)
            {
                output.add(x.substring(0,i)+ch+x.substring(i));
            }
        }
        return output;
    }

}

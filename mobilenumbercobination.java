import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<String> combinations(String s)
    {
        if(s==" ")
        {
             ArrayList<String> a=new ArrayList<>();
           a.add(" ");
           return a;
        }
       if(s.length()==0)
       {
           ArrayList<String> a=new ArrayList<>();
           a.add("");
           return a;
       }
        int n=s.charAt(0)-'0';
        String number[]=find(n);
         ArrayList<String> smallans=combinations(s.substring(1));
         ArrayList<String> output=new ArrayList<>();
         
             for(int i=0;i<number.length;i++)
             {
                 for(String f:smallans)
                 {
                      output.add(number[i]+f);
                 }
             }
        
        return output;
		
	}
    public static String[] find(int i)
    {
        if(i==1)
        {
            String s[]={""};
            return s;
        }
        else  if(i==2)
        {
            String s[]={"a","b","c"};
            return s;
        }
        else  if(i==3)
        {
            String s[]={"d","e","f"};
            return s;
        }
        else  if(i==4)
        {
            String s[]={"g","h","i"};
            return s;
        }
        else  if(i==5)
        {
            String s[]={"j","k","l"};
            return s;
        }
        else  if(i==6)
        {
            String s[]={"m","n","o"};
            return s;
        }
        else  if(i==7)
        {
            String s[]={"p","q","r","s"};
            return s;
        }
        else  if(i==8)
        {
            String s[]={"t","u","v"};
            return s;
        }
        else  if(i==9)
        {
            String s[]={"w","x","y","z"};
            return s;
        }
        else 
        {
            String s[]={""};
            return s;
        }
        
    }
}

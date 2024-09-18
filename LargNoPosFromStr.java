import java.util.Arrays;
import java.util.Comparator;

public class LargNoPosFromStr 
{
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            str[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(str, new Comparator<String>(){
            public int compare(String a , String b)
            {
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
            }
        });

        if(str[0].equals("0"))
        {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String f : str )
        {
            sb.append(f);
        }

        return sb.toString();
    }
}
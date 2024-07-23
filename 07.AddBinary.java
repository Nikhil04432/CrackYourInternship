class Solution {
    public String addBinary(String a, String b) {
        int x = a.length() -1 ;
        int y = b.length() - 1;
        int c = 0 ;
        StringBuilder str = new StringBuilder();

        while(x >= 0 || y >= 0)     // iterate if 1 string became empty
        {
            int s1 = 0,s2 = 0, sum;
            if(x >= 0)
            {
                s1 = a.charAt(x--) - '0' ;      // fetching the xth char as it is  e.g  if x = 1 then ascii value of 1 is 49 while of 0 is 48  ( 49 - 48 = 1) so this statement is for fetching the x th char 
            }
            if(y >= 0)
            {
                s2 = b.charAt(y--) - '0';
            }

            sum = s1 + s2 + c ;  
            

            if(sum >= 2)        //binary so 2 , here sum can't exceed the 2 if it does then we will substract 2 and set carry as 1 
            {
                c = 1;
                sum -= 2 ;
            }
            else
                 c = 0;
                str.append(sum);        // sum < 2 then simply append sum 
            
        }

        if( c == 1)     str.append(c);      // if loop terminates and carry is 1 then for proper output we have append it 

        return str.reverse().toString();       //we have stored output in sequence so have to reverse it .
    }
}
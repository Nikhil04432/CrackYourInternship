public class LongValidParenthesis {
    
    static int maxLength(String str){
        // code here
        int op = 0, cl = 0;
        int max1=0, max2=0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') op++;
            else cl++;
            if(cl > op) op = cl = 0;
            if(op == cl)  max1 = Math.max(max1,op*2);
        }
        
        op = cl = 0;
        
        //in some cases above code doesn't provide max substring that can be overcome by traversing from left 
        for(int i = str.length()-1; i >= 0; i--)
        {
            if(str.charAt(i) == ')') cl++;
            else op++;
            if(op > cl)  op = cl = 0;
            if(cl == op) max2 = Math.max(max2,op*2);
        }
        
        return Math.max(max1,max2);
    }
}
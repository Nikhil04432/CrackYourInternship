import java.util.Stack;

public class ParenthesisChecker
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String str)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
          
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')')
            {
                if(stack.empty()) return false;
                if(stack.peek() == '(')
                {
                    stack.pop();
                }
                else return false;
            }
            else if(str.charAt(i) == '}')
            {
                if(stack.empty()) return false;
                if(stack.peek() == '{')
                {
                    stack.pop();
                }
                else return false;
            }
             else if(str.charAt(i) == ']')
            {
                if(stack.empty()) return false;
                if(stack.peek() == '[')
                {
                    stack.pop();
                }
                else return false;
            }
            else{
                return false;
            }
            
        }
        
      return stack.empty();
    }
}

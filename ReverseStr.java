public class ReverseStr{
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] word = str.split("\\.");
        StringBuilder s = new StringBuilder("");
        for(int i =  word.length -1; i >= 0; i--){
            s.append(word[i]);
            if(i != 0){
                s.append(".");
            }
        }
        
        return s.toString();
    }
}
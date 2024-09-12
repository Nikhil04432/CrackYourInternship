public class ConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        int[] a = new int[26];

        for(char i : allowed.toCharArray()){
            a[i-'a']++;                     // this array has 1 in place where it has character otherwise 0
        }

        for(String word : words){
            boolean consistent = true;
            for(char i : word.toCharArray()){
                if(a[i - 'a'] == 0){        //if 0 then there is no such char in allowed string 
                    consistent = false;
                } 
            }
            if(consistent){
               ans++;
            }
        }
        return ans;
    }
}

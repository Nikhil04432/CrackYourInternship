import java.util.List;

public class MinTimeDif  {
    
    public int findMinDifference(List<String> time) {
        boolean[] arr = new boolean[1440];

        for(String i : time){
            int hours = Integer.parseInt(i.substring(0,2));
            int minute = Integer.parseInt(i.substring(3,5));
            int min = hours*60+minute;
            if(arr[min]) return 0;
            arr[min] = true;

        }

        int pre = -1;
        int firstVal = -1;
        int mindif = Integer.MAX_VALUE;

        for(int cur = 0; cur < 1440; cur++){
            if(arr[cur]){
                if(pre == -1){
                     pre = cur ;
                    firstVal = cur;
                } 
                else{
                    mindif = Math.min(mindif,cur-pre);
                    pre = cur;
                }

            }
        }

        if(pre != -1){
            mindif = Math.min(mindif, 1440+firstVal-pre);
        }

        return mindif;
    }
}
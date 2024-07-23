public class CeilInSortedArray {

    public static int Ceil(int[] arr, int x )
    {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r)
        {
            int mid = (l+r)/2 ;

            if(arr[mid] == x)
            {
                return arr[mid];

            } else if (arr[mid] < x ) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        if(l < arr.length){
            return  arr[l];
        }else {
            return -1;
        }

    }

}

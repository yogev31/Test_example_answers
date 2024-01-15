public class Q4 {
    public static int q4(int[] arr)
    {
        int count = 0;
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i] % 2 != 0 && arr[i+1] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}

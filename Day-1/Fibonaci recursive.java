class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long num1 = 1L;
        long num2 = 1L;
        long[] arr = new long[n];
        arr[0] = num1;
        if(n==1){
            return arr;
        }
        arr[1] = num2;
        for(int i=2;i<n;i++){
    		arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }
}
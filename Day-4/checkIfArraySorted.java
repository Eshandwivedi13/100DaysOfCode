class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // Approach 1-
      /*  int [] brr=Arrays.copyOf(arr,n);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i] != brr[i]){
                return false;
            }
        }
        return true; */
        
        //Approach -2
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        
        return true;
    }
}
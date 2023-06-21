class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largestElement = -1;
        int secondLargestElement = -1;
         for(int i=0;i<n;i++){
            if(arr[i] > largestElement){
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }else if(arr[i] > secondLargestElement && arr[i] != largestElement){
                secondLargestElement = arr[i];
            }
        }
       return secondLargestElement;
    }
}
class Solution
{
	int[] select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        selectionSort(arr, i);
        return arr;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        int mini = i;
	        for(int j=i+1;j<n;j++){
	            if(arr[mini] > arr[j]){
	                mini = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[mini];
	        arr[mini] = temp;
	    }
	}
}
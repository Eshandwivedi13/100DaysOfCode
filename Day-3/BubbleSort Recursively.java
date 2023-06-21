class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {	
		doBubbleSort(arr, n, 0);
		
    }
    	public static void doBubbleSort(int arr[], int n, int i)
    {
        if(i == n){
            return;
        }
			for(int j=0;j<n-i-1;j++){// N-i-1 tak isliye taki kam comparison ho, N-1 tak bhi chalega,last wala to sorted hota jayega har bar
				if(arr[j]>arr[j+1]){//descending order, ascending karna hota to opposite kar dete
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
		 doBubbleSort(arr, n, i+1);
    }
}
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
       	for(int i=0;i<n-1;i++){//n-1 pases honge n size ke array ke liye
			boolean flag = true;
			for(int j=0;j<n-i-1;j++){// N-i-1 tak isliye taki kam comparison ho, N-1 tak bhi chalega,last wala to sorted hota jayega har bar
				if(arr[j]>arr[j+1]){//descending order, ascending karna hota to opposite kar dete
					flag = false;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
			if(flag == true){
					return; // or break
				}
		} 
    }
}
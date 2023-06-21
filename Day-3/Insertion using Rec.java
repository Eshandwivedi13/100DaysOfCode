
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
    //   insert(arr,i);
    insert(arr,i);
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
	  doinsertion(arr, n, 0);
  }
   public int[] doinsertion(int arr[], int n, int i)
  {
      if(i==n){
	       return arr;
	   }
	   int j = i - 1;
	    while(j>=0 && arr[j]>arr[j+1]){// j aur j+1 ko compare karenge
			   int temp = arr[j];//swap karenge
			   arr[j] = arr[j+1];
			   arr[j+1] = temp;
			   j--;// j ko ghatayenge taaki peeche tak iterate kar sake, ascending order
		   }
	   return doinsertion(arr,n,i+1);
  }
}
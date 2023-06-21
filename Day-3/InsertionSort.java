class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       insert(arr,i);
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
     for(int i=1;i<n;i++){//ye mante hai ki left side wala already sorted hai, isliye 1 se chalate h
		   int j = i-1;// i se pehle wala index j hai
		   while(j>=0 && arr[j]>arr[j+1]){// j aur j+1 ko compare karenge
			   int temp = arr[j];//swap karenge
			   arr[j] = arr[j+1];
			   arr[j+1] = temp;
			   j--;// j ko ghatayenge taaki peeche tak iterate kar sake, ascending order
		   }
	   }
  }
}
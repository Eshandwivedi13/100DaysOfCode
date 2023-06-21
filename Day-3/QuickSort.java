class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        //smaller to left, larger to right -> divide and conquer
        if(low<high){//if low < high then only follow these steps, otherWise if theres one element so it will be sorted itself
            int partition = partition(arr,low,high);//it'll keep running again and again
            quickSort(arr, low, partition-1);//smaller
            quickSort(arr,partition+1, high);//larger
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){// i should be less than j also i<=high-1 and j>=low+1, so they dont cross boundary in the next step...
            while(pivot >= arr[i] && i<=high-1 ){//keep on moving i forward till the pivot is greater than current element or equal to
                i++;
            }//at the end we will have an element greater than the pivot
            while( pivot < arr[j] && j>=low+1){//keep on moving j backward till the pivot is smaller than current element 
                j--;
            }//at the end we will have element which will be lesser than pivot
            if(i<j){//if i is lesser then j, we can swap i and j because at i we have element greater than pivot and at j we have lesser than pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //in the end at j index we will have the smaller element than pivot and we have to swap that with pivet and return the newindex of pivet
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
        
    } 
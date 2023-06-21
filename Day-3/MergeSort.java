class Solution
{
    // using arrayList -> but it is slow
/*    void merge(int arr[], int l, int m, int h)
    {
        ArrayList<Integer> brr = new ArrayList<>();
       int left = l;
       int right = m +1;
    //   int index = 0;
    //   int temp[] = new int[end-start + 1];
       while(left <= m && right <= h){
          if(arr[left] <= arr[right]){//if left element is less than or equal to right element then add left and move left forward
              brr.add(arr[left]);
              left++;
          }else{
               brr.add(arr[right]);// else add right and move right forward
              right++;
          }
         }
        while(left <= m){ //if left remains add it
             brr.add(arr[left]);
            left++;    
         }
         while(right <= h){//if right remains add it
               brr.add(arr[right]);
              right++;
         }
         
         for(int i=l;i<=h;i++){//from low to high everytime, the value will get updated itself in every call
             arr[i] = brr.get(i-l);//we are decreasing i - l to make it 0 based indexing for storing in array
         }
    } */
    
    //using array on the same thing
    void merge(int arr[], int l, int m, int h)
    {
       int left = l;
       int right = m +1;
       int index = 0;
        int temp[] = new int[h-l + 1];
      while(left <= m && right <= h){
          if(arr[left] <= arr[right]){//if left element is less than or equal to right element then add left and move left forward
              temp[index] = arr[left];
              left++;
              index++;
          }else{
              temp[index] = arr[right];// else add right and move right forward
              right++;
              index++;
          }
         }
        while(left <= m){ //if left remains add it
           temp[index] = arr[left];
              left++;
              index++;  
         }
         while(right <= h){//if right remains add it
               temp[index] = arr[right];// else add right and move right forward
              right++;
              index++;
         }
          // copy elements in original array
         for(int i=l;i<=h;i++){//from low to high everytime, the value will get updated itself in every call
             arr[i] = temp[i-l];//we are decreasing i - l to make it 0 based indexing for storing in array
         }
    }
    void mergeSort(int arr[], int l, int h)
    {//based on divide and merge
        if(l>=h){
            return;
        }
        int mid = (l+h)/2;
        mergeSort(arr,l, mid);//first half of the array
        mergeSort(arr,mid+1, h);//second half of the array
        merge(arr,l,mid,h);//merge it again and again
    }
}

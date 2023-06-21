class Solution {
    int remove_duplicate(int A[],int N){
      int index = 1;
    // check for the adjacent element which is different, place it at index update the index
    // Note: Think of the array as newly declared array starting from index 1
      for(int i=0;i<N-1;i++){
          if(A[i] != A[i+1]){
              A[index] = A[i+1]; 
               index++;
          }
           // Skipping the elements which are equal
      }
        return index;
    }
}
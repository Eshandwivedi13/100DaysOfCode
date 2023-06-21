class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // int result[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     // int newIdx = i + k;
        //     // if(newIdx >= n){
        //     //     newIdx = newIdx - n;
        //     // }
        //     // result[newIdx] = nums[i];
        //     int newIdx = (i + k) % n;
        //     result[newIdx] = nums[i];
        // }
        // for(int i=0; i<n; i++){
		// 	System.out.print(result[i]+ " ");
		// }
         reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] nums, int l, int r) {
    while (l < r)
      {
          swap(nums, l++, r--);
      }
  }
  private void swap(int nums[], int l, int r){
      int temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
  }
}
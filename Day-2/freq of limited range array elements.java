class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){//if key is already there
                map.put(arr[i],map.get(arr[i]) +1);//then get the freq of key and update it by 1
            }else{
                map.put(arr[i],1);//otherWise put the freq of that key as 1, which is not present in map
            }
        }
         
       for(int i=1;i<=N;i++){//now go to map, map is 1 based indexing but array 0 based indexing
           if(map.get(i)!= null){   //if there's some freq for current index then put it in the array
               
                arr[i-1] = map.get(i);//getting the freq of ith index and putting it in i-1, 0 based indexing
            }
            else{//otherwise put 0
                arr[i-1] = 0;
            }
       }
        
    }
}
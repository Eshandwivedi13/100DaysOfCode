
class Solution {
    public int[] topK(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){//for every integer belonging to nums
//Note: .getOrDefault(element, 0) returns value where element is the key else returns 0
            map.put(i, map.getOrDefault(i,0)+1);//if it is not already present the value will come as zero and we increment it and so on
        }
        
        //Create a list from the elements of the hashmap
        //Note: .entrySet() method returns the set of entries in hashmap
        List<Map.Entry<Integer, Integer>> a1 = new ArrayList<>(map.entrySet());
        
        //sort the arraylist in descending order of values and if values are equal then descending order of keys
        //Note: We cannot directly use a.getvalue() == b.getValue() instead use Objects.equals(obj1,obj2) method
        
        //if the values are equal then sort it according to the key, if values not equal then only sort according the values itself
        a1.sort((a,b) -> Objects.equals(a.getValue(), b.getValue()) ? b.getKey()-a.getKey() : b.getValue() - a.getValue());//if we will get positive then only it will sort
       
       //create an array of size K and get the keys
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i] = a1.get(i).getKey();//whatever is the element at index i, get the key of that element
        }
        return ans;
    }

}
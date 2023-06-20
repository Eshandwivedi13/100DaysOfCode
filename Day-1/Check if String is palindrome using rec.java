class Solution {
    int isPalindrome(String S) {
        // code here
        // boolean isPalindrome = true;
        // int n = S.length();
        // int i =0, j=n-1;
        // while(i<n){
        //     while(!Character.isLetterOrDigit(S.charAt(i))){
        //         i++;
        //     }
        //     while(!Character.isLetterOrDigit(S.charAt(j))){
        //         j--;
        //     }
        //     if(S.charAt(i) != S.charAt(j)){
        //         isPalindrome = false;
        //     }
        // }
        // if(isPalindrome){
        //     return 1;
        // }else{
        //     return 0;
        // }
        int res = helper(S, 0, S.length()-1);
        return res;
    }
    int helper(String s, int start , int end){
        if(start>=end){
            return 1;
        }
        if(s.charAt(start) != s.charAt(end)){
            return 0;
        }
        return helper(s, start+1, end-1);
    }
};
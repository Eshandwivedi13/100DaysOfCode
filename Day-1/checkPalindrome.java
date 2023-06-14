class Solution
{
    public String is_palindrome(int n)
    {
        int copyOfN =n;
        int reverseN = 0;
        while(copyOfN > 0){
            int lastDigit = copyOfN % 10;
            reverseN = reverseN * 10 + lastDigit;
            copyOfN /= 10;
        }
        if(reverseN == n){
            return "Yes";
        }else{
            return "No";
        }
    }
}
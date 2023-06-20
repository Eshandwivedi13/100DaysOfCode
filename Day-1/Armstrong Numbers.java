class Solution {
    static String armstrongNumber(int n){
        int copyofN = n;
        int sum = 0;
        int totalDigits = 0;
        while(copyofN>0){
            totalDigits++;
            copyofN = copyofN/10;
        }
        copyofN = n;
        while(copyofN>0){
            int lastDigit = copyofN%10;
            int product = (int)Math.pow(lastDigit, totalDigits);
            sum+= product;
            copyofN = copyofN/10;
        }
        if(sum == n){
            return "Yes";
        }else{
            return "No";
        }
    }
}
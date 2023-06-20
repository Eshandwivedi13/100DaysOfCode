

//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        int temp = N;
        int count = 0;
        while(N>0){
            int lastDigit = N %10;
            if(lastDigit > 0 && temp % lastDigit == 0){//evenly divide kr rha ha iiska matlab h
                count++;
            }
            N /= 10;
        }
        return count;
    }
}
class Solution {
    long sumOfSeries(long N) {
        // code here
        if(N==0){
            return 0;
        }
        return (N*N*N) + sumOfSeries(N-1);
    }
}
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
       /* long small = 0L;
        long gcd = 0L;
        long Lcm = 0L;
        if(A>B){
            small = B;
        }else{
            small = A;
        }
        for(int i=1;i<=small;i++){
            if((A % i ==0) &&( B % i ==0)){
                gcd = i;
            }
        }
         if (gcd != 0) {
             Lcm = (A * B) / gcd;
          }
        Long[] arr = new Long[2];
        arr[0] = Lcm;
        arr[1] = gcd;
        return arr; */
        Long[] arr = new Long[2];
        Long gcd = helper(A,B); 
        Long lcm = (A*B) / gcd;
        arr[0] = lcm;
        arr[1] = gcd;
        return arr;
        
    }
    static Long helper(Long A, Long B){
        if(B==0){
            return A;
        }
        return helper(B, A%B);
    }
    
    //  while(A%B!=0){
    //         int temp = A;
    //         A = B;
    //         B = temp%B;
    //     }
    //     return B;
};
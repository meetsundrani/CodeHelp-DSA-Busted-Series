class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans=1;
       
       for(int i=1; i<=31;i++){
            if(ans==n){
               return true;
           }
           if(ans< Integer.MAX_VALUE/2)
           ans = 2*ans;
           
       }
        return false;
        
    }
}
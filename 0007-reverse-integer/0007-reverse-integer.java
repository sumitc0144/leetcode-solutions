class Solution {
   
    public int reverse(int x) {
        int rev=0;
        while(x!=0){    
            int last=x%10;
            x/=10;
            // ✅ Overflow check:
            // If rev is already bigger than MAX/10, multiplying by 10 will overflow.
            // If rev == MAX/10, then adding a digit > 7 will overflow (since MAX ends with 7).
           
             if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && last > 7)) {
                return 0;
            }
            // Same logic for negative side:
            // If rev < MIN/10, multiplying by 10 will overflow.
            // If rev == MIN/10, then adding a digit < -8 will overflow (since MIN ends with -8).
           
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && last < -8)) {
                return 0;
            }
            rev=(rev*10)+last;
        }
        return rev;            
    }
}
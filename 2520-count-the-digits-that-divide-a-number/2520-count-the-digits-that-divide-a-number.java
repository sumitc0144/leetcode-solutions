class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int nume=num;
        while(nume>0){
            int digit=nume%10;
            if(digit!=0 && num%digit==0){
                cnt++;
            }
            nume=nume/10;

        }
        return cnt;
    }
}
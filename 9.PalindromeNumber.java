class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int rev=0;
            int origin=x;
            while(origin>0){
                rev=rev*10+origin%10;
                origin=origin/10;
            }
            return x==rev;
        }
        return false;
    }
}
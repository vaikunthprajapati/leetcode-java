class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(true){
         slow = getNumber(slow);
         fast = getNumber(getNumber(fast));
            if( slow == fast ){
                break;
            }
        }
        return slow == 1;
}

        private int getNumber(int n){
            int sum = 0;
            while(n != 0){
                int digit = n%10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
            
        }
}
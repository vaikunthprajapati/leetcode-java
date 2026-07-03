class Solution(object):
    def reverse(self, x):
        INT_MIN= -2**31
        INT_MAX= 2**31-1
        sign=-1 if x<0 else 1
        x=abs(x)

        reversed=0
        while x != 0:
            digit=x%10
            reversed=reversed*10+digit
            x=x//10

        reversed*= sign

        if reversed<INT_MIN or reversed>INT_MAX:
            return 0
        return reversed
        
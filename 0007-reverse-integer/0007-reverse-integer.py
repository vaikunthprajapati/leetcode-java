class Solution:
    def reverse(self, x):
        sign = -1 if x < 0 else 1

        reversed_number = int(str(abs(x))[::-1]) * sign

        if -(2**31) <= reversed_number <= 2**31 - 1:
            return reversed_number

        return 0
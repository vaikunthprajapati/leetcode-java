class Solution(object):
    def isPalindrome(self, x):
        palindrome =int(str(abs(x))[::-1])
        if x==palindrome:
            return True
        else:
            return False
        
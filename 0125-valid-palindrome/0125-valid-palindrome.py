class Solution(object):
    def isPalindrome(self, s):
        cleaned = ""
        for ch in s:
            if ch.isalnum():
                cleaned += ch.lower()
        if cleaned[::-1]==cleaned:
            return True
        else:
            return False
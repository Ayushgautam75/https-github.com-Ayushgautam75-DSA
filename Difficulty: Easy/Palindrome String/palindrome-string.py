class Solution:
    def isPalindrome(self, s):
        # code here
        return self.check(s, 0, len(s) - 1)
    def check(self,s, left, right):
        if left >= right:
            return True
        if s[left] != s[right]:
            return False
        return self.check(s, left + 1, right -1)
class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        mx= 0
        f=[]
        for i in range(0,len(nums)):
            mx = max(nums[i],mx)
            f.append(gcd(nums[i],mx))
        f.sort()
        i=0
        j = len(f)-1
        sum=0
        while i<j:
            sum +=gcd(f[i],f[j])
            i+=1
            j-=1
        return sum
        
            
        
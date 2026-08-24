class Solution:
    def findDisappearedNumbers(self, nums: list[int], lower: int, upper: int) -> list[list[int]]:
        missing = []
        present = set(nums)

        for i in range(lower,upper+1):
            if i not in present:
                missing.append(i)

        if not missing:
            return []
        
        final_missing = []
        start = missing[0]

        for i in range(1 , len(missing)):
            if missing[i] != missing[i-1] + 1:
                final_missing.append([start,missing[i-1]])

                start = missing[i]

        final_missing.append([start,missing[-1]])    
    
        return final_missing
            

        
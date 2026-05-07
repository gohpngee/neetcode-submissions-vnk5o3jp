class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        intMap = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in intMap:
                return [intMap.get(complement), i]
            else:
                intMap[nums[i]] = i
        return [-1,-1]
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sMap = {}
        tMap = {}

        for i in range(len(s)):
            if s[i] in sMap:
                sWordCount = sMap.get(s[i])
                sMap[s[i]] = sWordCount + 1
            else:
                sMap[s[i]] = 1
        
        for j in range(len(t)):
            if t[j] in tMap:
                tWordCount = tMap.get(t[j])
                tMap[t[j]] = tWordCount + 1
            else:
                tMap[t[j]] = 1
        
        return sMap == tMap
        
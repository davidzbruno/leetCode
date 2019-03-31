# Name: David Bruno
# Start Date: 03/30/2019
# File: p771.java
#
# Solve Date: 03/30/2019
# Runtime: 7 ms
# Memory: 38 MB

class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        result = 0
        for stone in S:
            if stone in J:
                result+=1
        return result
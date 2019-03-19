/*
Name: David Bruno
Start Date: 03/18/2019
File: p771.java

Solve Date: 03/18/2019
Runtime: 7 ms
Memory: 38 MB

*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        
        for(char stone : S.toCharArray() ){
            if(J.contains(""+stone))
                result++;
        }

        return result;
    }
}
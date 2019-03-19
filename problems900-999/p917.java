/*
Name: David Bruno
Start Date: 03/18/2019
File: p771.java

Solve Date: 03/18/2019
Runtime: ----
Memory: ----

*/
class Solution {
    public String reverseOnlyLetters(String S) {
        String result = "";
        
        for( int i = 0; i < S.length(); ++i){
            if(Character.isLetter(S.charAt(i))){
                result += S.charAt(S.length() - 1 - i);
            }
            else
                result += S.charAt(i);
        }

        return result;
    }
}
/*
Name: David Bruno
Start Date: 03/18/2019
File: p771.java

Solve Date: 03/18/2019
Runtime: 4ms
Memory: 37.2 MB

*/
class Solution {
    public String reverseOnlyLetters(String S) {
        String result = "";
        String reversedLetters = "";

        //Add the reversed letters to a string;
        for(int i = S.length()-1; i >= 0; --i){
            if(Character.isLetter(S.charAt(i)))
                reversedLetters += S.charAt(i);
        }

        //Reconstruct the string but with the reveresed letters
        for( int i = 0, j = 0; i < S.length(); ++i){
            if(Character.isLetter(S.charAt(i))){
                result += reversedLetters.charAt(j++);
            }
            else
                result += S.charAt(i);
        }

        return result;
    }
}
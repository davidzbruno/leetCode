/*
Name: David Bruno
Start Date: 03/18/2019
File: p680.java

Solve Date: 03/18/2019
Runtime: --
Memory: --
*/
class Solution {
    public boolean validPalindrome(String s) {
        //boundary cases
        if( s.length() < 1) return false;

        //create character array
        s = s.toLowerCase();
        int[] freq = new int[100];
        int offset = 1;

        for(char c : s.toCharArray() ){
            if(Character.isLetter(c)){
                freq[c - 'A'] = (freq[c - 'A'] > 0) ? freq[c - 'A']-1 : freq[c - 'A']+1;
            }
            if(Character.isDigit(c)){
                freq[c + 60] = (freq[c + 60] > 0) ? freq[c + 60]-1 : freq[c + 60]+1;
            }
        }

        int palindrome = 0;
        for(int i : freq){
            palindrome += i;
        }

        System.out.println(palindrome);
        
        //check if palindrome by at least one letter
        if( palindrome <= offset || (s.length%2==1 && palindrome <= offset+1) ) return true;

        return false;

    }
}
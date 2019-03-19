/*
Name: David Bruno
Start Date: 03/18/2019
File: p125.java

Solve Date: 03/18/2019
Runtime: 5ms
Memory: 35.2 MB
*/
    
class Solution {
    public boolean isPalindrome(String s) {
        //boundary cases
        if(s.length() < 0) return false;
        
        s = s.toLowerCase();
        
        //two pointer method
        int i = 0; int j = s.length() -1;
        
        while(i < j){
            
            //skip non-alphanumerics
            while(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                if( i >= j ) return true;
                i++;
            }
            while(!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))){
                if( j <= i ) return true;
                j--;
            }
            
            //check palindrone
            if( s.charAt(i) != s.charAt(j)){
                return false;
            }
            
            //update pointers
            i++; j--;

        }
        return true;
    }
}
class Solution {
    public String reverseOnlyLetters(String S) {
        String result = "";
        
        for( int i = 0; i < S.length(); ++i){
            if(Character.isAlpha(S.charAt(i))){
                result += S.charAt(S.length() - 1 - i);
            }
            else
                result += S.charAt(i);
        }

        return result;
    }
}
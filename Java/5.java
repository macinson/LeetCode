class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 1;
        
        for(int i = 0; i < s.length(); i++) {
            int tempStart = i;
            int tempEnd = i;
            
            while(tempStart >=0 && tempEnd < s.length() && s.charAt(tempStart) == s.charAt(tempEnd)) {
                tempStart--;
                tempEnd++;
            }
            
            if(tempEnd - tempStart > end - start) {
                end = tempEnd;
                start = tempStart;
            }

            tempStart = i;
            tempEnd = i+1;

            while(tempStart >=0 && tempEnd < s.length() && s.charAt(tempStart) == s.charAt(tempEnd)) {
                tempStart--;
                tempEnd++;
            }

            if(tempEnd - tempStart > end - start) {
                end = tempEnd;
                start = tempStart;
            } 
        }

        return s.substring(start + 1, end);
    }
}

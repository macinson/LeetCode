class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> known = new HashSet<>();
        while(right < arr.length){
            if(known.add(arr[right])){
                right++;
                max = Math.max(max,known.size());
            }
            else{
                known.remove(arr[left++]);
            }
        }
        return max;
    }
}

using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        set<char> known;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right < s.length()){
            if(known.insert(s.at(right)).second){
                right++;
                maxLength = fmax(maxLength,known.size());
            }
            else{
                known.erase(s.at(left++));
            }
        }
        return maxLength;
    }



};

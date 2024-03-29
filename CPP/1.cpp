using namespace std;
#include <unordered_map>
#include <cmath>
#include <vector>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> hashMap;
        for(int i =0; i < nums.size(); i++){
            int r = target - nums.at(i);
            if(hashMap.contains(r)){
                return vector<int> {hashMap.at(r),i};
            }
            hashMap.insert({nums.at(i),i});
        }
        return {};
    }
};

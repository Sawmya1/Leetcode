class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int ele_sum=0, dig_sum=0;
        for(auto x: nums){
            ele_sum += x ;
        }
        for(auto i: nums){
            while(i){
                int digit = i%10;
                dig_sum += digit;
                i/=10;   
            }
        }
        return ele_sum - dig_sum;

//             int sum = 0;
//     for (int i = 0; i < nums.size(); i++)
//     {
//         sum += nums[i];
//     }
//     int sum2 = 0;
//     for (int i = 0; i < nums.size(); i++)
//     {

//         sum2 += nums[i] % 10;
//         nums[i] /= 10;
//     }
//     int ans = abs(sum - sum2);
//     return ans;

    }
};
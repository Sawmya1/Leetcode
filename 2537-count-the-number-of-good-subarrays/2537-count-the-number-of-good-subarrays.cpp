class Solution { 
public: 
    long long  countGood(vector<int>& nums, int k) { 
        long long n = nums.size(); 
        long long curr = 0; 
        long long res = 0; 
        unordered_map<long long, long long> cnt; 
        int l = 0; 
        for (int r = 0; r < n; r++) { 
            if (cnt[nums[r]] > 0) { 
                curr += cnt[nums[r]]; 
            } 
            cnt[nums[r]]++; 
            while (l <= r && curr >= k) { 
                if (cnt[nums[l]] > 1) { 
                    curr -= (cnt[nums[l]] - 1); 
                } 
                cnt[nums[l]]--; 
                l++; 
            } 
            res += (r - l + 1); 
        } 
        return (n * (n + 1) / 2) - res; 
    } 
};
// class Solution {
//     int merge(vector<int> &arr, vector<int> &temp,
//           int l, int m, int r, int K)
// {
//     int i = l,j = m + 1,cnt = 0;
 
//     for (int i = l; i <= m; i++) {
//         int found = 0;
//         while (j <= r) {
//             if (arr[i] ==arr[j]) {
//                 found++;
//                   j++;
//             }
//             else break;
//         }
//         if (found>=K) {
//             cnt += j - (m + 1);
//             j--;
//         }
//     }
//     int k = l;
//     i = l;
//     j = m + 1;
 
//     while (i <= m && j <= r) {
 
//         if (arr[i] <= arr[j])
//             temp[k++] = arr[i++];
//         else
//             temp[k++] = arr[j++];
//     }
//     while (i <= m)
//         temp[k++] = arr[i++];
//     while (j <= r)
//         temp[k++] = arr[j++];
 
//     for (int i = l; i <= r; i++)
//         arr[i] = temp[i];
//     return cnt;
// }
//     int mergeSortUtil(vector<int> &arr, vector<int> &temp,
//                   int l, int r, int K)
// {
//     int cnt = 0;
//     if (l < r) {
//         int m = (l + r) / 2;
//         cnt += mergeSortUtil(arr, temp,
//                              l, m, K);
//         cnt += mergeSortUtil(arr, temp,
//                              m + 1, r, K);
//         cnt += merge(arr, temp, l,
//                      m, r, K);
//     }
 
//     return cnt;
// }
 
// public:
//     long long countGood(vector<int>& nums, int k) {
//         int n = nums.size();
//         vector<int> temp(n,0);
//         return mergeSortUtil(nums,temp,0,n-1,k);
//     }
// };
// class Solution {
//     int merge(vector<int> &arr, vector<int> &temp,
//           int l, int m, int r, int K)
// {
//     int i = l,j = m + 1,cnt = 0;
 
//     for (int i = l; i <= m; i++) {
//         int found = 0;
//         while (j <= r) {
//             if (arr[i] ==arr[j]) {
//                 found++;
//                   j++;
//             }
//             else break;
//         }
//         if (found>=K) {
//             cnt += j - (m + 1);
//             j--;
//         }
//     }
//     int k = l;
//     i = l;
//     j = m + 1;
 
//     while (i <= m && j <= r) {
 
//         if (arr[i] <= arr[j])
//             temp[k++] = arr[i++];
//         else
//             temp[k++] = arr[j++];
//     }
//     while (i <= m)
//         temp[k++] = arr[i++];
//     while (j <= r)
//         temp[k++] = arr[j++];
 
//     for (int i = l; i <= r; i++)
//         arr[i] = temp[i];
//     return cnt;
// }
//     int mergeSortUtil(vector<int> &arr, vector<int> &temp,
//                   int l, int r, int K)
// {
//     int cnt = 0;
//     if (l < r) {
//         int m = (l + r) / 2;
//         cnt += mergeSortUtil(arr, temp,
//                              l, m, K);
//         cnt += mergeSortUtil(arr, temp,
//                              m + 1, r, K);
//         cnt += merge(arr, temp, l,
//                      m, r, K);
//     }
 
//     return cnt;
// }
 
// public:
//     long long countGood(vector<int>& nums, int k) {
//         int n = nums.size();
//         vector<int> temp(n,0);
//         return mergeSortUtil(nums,temp,0,n-1,k);
//     }
// };
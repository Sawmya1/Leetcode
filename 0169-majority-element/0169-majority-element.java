class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;
        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }
        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;

        // int count = 0, candidate = 0;
        // for(int num : nums){
        //     if(count == 0)
        //         candidate = num;
        //     if(num == candidate)
        //         count += 1;
        //     else
        //         count -= 1;
        // }
        // return candidate;
        // int cnt=1,ma=0,n=arr.length, ans=1;
        // if(n==1)
        //     return arr[0];
        // for(int i=0;i<n-1;i++){
        //     cnt=1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j])
        //             cnt++;
        //     }
        //     if(cnt>Math.floor(n/2)){
        //         return arr[i];
        //     //     ma=Math.max(ma,cnt);     
        //     //     if(ma>cnt)
        //     //       ans=arr[i];
        //     }    
        // }
        // return ans;       
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       int mid = (nums1.length+nums2.length)/2;
        int i=0;
        int left=0;
        int right=0;
        int elem=0;
        int temp=0;
        
        while(i<=mid &&( left<nums1.length || right< nums2.length )){            
            
            if(left== nums1.length && right== nums2.length) break;
            else if(left== nums1.length) elem = nums2[right++];
            else if(right== nums2.length) elem = nums1[left++];

            else{
                 if(nums1[left]< nums2[right])  elem = nums1[left++];
                 else elem = nums2[right++];
            }
         
            if(mid==i && (nums1.length+nums2.length)%2!=0 ) return elem;
            else if(mid-1==i) temp =elem;
            i++;
        }
        return (double)(temp+elem)/2;
        
    }
}

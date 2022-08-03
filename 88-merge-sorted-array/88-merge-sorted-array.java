class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++,m++){ //m++ num1 index inc
            nums1[m]=nums2[i];
        }
        Arrays.sort(nums1);

        // int nums3[] = new int[m+n];
        // int k=0;
        // for(int i=0;i<m;i++)
        //     nums3[k++]=nums1[i];
        // for(int i=0;i<n;i++)
        //     nums3[k++]=nums2[i];
        // Arrays.sort(nums3);
//         k=0;
//         for(int i=0;i<m;i++)
//             nums1[i]=nums3[k++];
//         for(int i=0;i<n;i++)
//             nums2[i]=nums3[k++];        
        
    }
}
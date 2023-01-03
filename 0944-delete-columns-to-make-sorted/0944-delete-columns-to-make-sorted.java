class Solution {
    public int minDeletionSize(String[] strs) {
        // Initialize the delete count to 0
        int deleteCount = 0;
        // Get the number of rows and columns in the grid
        int n = strs.length;
        int m = strs[0].length();
        // Iterate through each column of the grid
        for (int i = 0; i < m; i++) {
            // Iterate through each element in the column
            for (int j = 1; j < n; j++) {
                // If the current element is lexicographically smaller than the previous element,
                // increment the delete count and break out of the loop
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    deleteCount++;
                    break;
                }
            }
        }
        // Return the delete count
        return deleteCount;
    }
}
//class Solution {
//     private boolean isAlphabaticOrder(String s) {
           
//         for (int i = 1; i < s.length(); i++) {
//         // if element at index 'i' is less than the element at index 'i-1 then the string is not sorted
//             if (s.charAt(i) < s.charAt(i - 1)) 
//                 return false; 
//         }
//         return true;
//     }
//     private boolean isReverseOrder(String s) {
//           for (int i = s.length()-1; i <= 1; i--) 
//             if (s.charAt(i-1) < s.charAt(i)) 
//                 return false; 
        
//         return true;
//     }

//     public int minDeletionSize(String[] strs) {
//         if(strs.length == 0 || strs[0].length() == 1)
//             return 0;
//         int count = 0;
//         for(int i=0;i<strs.length;i++){
//             if(isAlphabaticOrder(strs[i]) || isReverseOrder(strs[i]))
//                 continue;
//             else
//                 count++;
//         }
//         return count;
//     }
// }
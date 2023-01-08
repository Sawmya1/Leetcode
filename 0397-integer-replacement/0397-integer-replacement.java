class Solution {
    public int integerReplacement(int n) {
        int cnt = 0;
        if (n == 2147483647) {
	        n = 1073741824;
	        cnt = 2;
        }

        while (n != 1) {
	        if (n == 3 || n % 2 == 1 && (n - 1) % 4 == 0)
		        n = n - 1;
	        else if (n % 2 == 1)
		        n = n + 1;
	        else
		        n = n / 2;
	        cnt++;
        }
        return cnt;
        
//         int op = 0;
//         while(n != 1){
//             if(n%2 == 0){
//                 n /= 2;
//                 op++;
//             }
//             else{
//                 n -= 1;
//                 op++;
//             }

//         }
//         return op;
        
    }
}
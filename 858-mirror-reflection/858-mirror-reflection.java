class Solution {
    public int mirrorReflection(int p, int q) {
            //  0,1,2
            // wall size, meeting
//         if(p%2==0)
//             return 2;
//         else if(q%2!=0)
//             return 1;
//         else
//             return 0;
        while(p%2==0 && q%2==0){
            p /= 2;
            q /= 2;
        }
        return 1 - p%2 + q%2;
           
    }
}

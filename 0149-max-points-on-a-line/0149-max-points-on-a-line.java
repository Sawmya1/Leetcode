class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if(n <=2) return n;
        int ans = 2;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = 2;
                for(int k=0; k<n; k++){
                    if(k!= i && k!= j){
                        int x = (p[j][1] - p[i][1] ) * (p[k][0] - p[i][0]);
                        int y =  ( p[k][1] - p[i][1]) * (p[j][0]-p[i][0]) ;
                        if(x==y){
                            temp++;
                        }
                    }
                }
                if(temp > ans){
                    ans = temp;
                }
            }
        }
        return ans;

//         int max=0;
//         for(int[] x:points)
//         {
//             Map<Double,Integer> map= new HashMap<>();
//             for(int[] y:points){
//                 if(x==y)
//                   continue;
                
//                 double slope=0;
//                 if(y[0]-x[0]==0)
//                    slope=Double.POSITIVE_INFINITY; 
//                 else
//                    slope = (y[1]-x[1])/(double)(y[0]-x[0]);
                
//                 map.put(slope,map.getOrDefault(slope,0)+1);
//                 max=Math.max(max,map.get(slope));
//             }
//         }
//         return max+1;

    }
}
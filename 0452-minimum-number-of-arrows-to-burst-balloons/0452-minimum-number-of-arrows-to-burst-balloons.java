class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        Arrays.sort(points, new java.util.Comparator<int[]>() 
                    {
                        public int compare(int[] a, int[] b) 
                        {
                            return Integer.compare(a[0], b[0]);
                        }
                    });
        
        int currRight = points[0][1];
        int count = 1;
        
        for(int i=1; i<points.length; i++)
        {
            if(currRight>=points[i][0])
            {
                currRight = Math.min(currRight,points[i][1]);
            }
            else
            {
                count++;
                currRight = points[i][1];
            }
        }
        return count;
    }
}
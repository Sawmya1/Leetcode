class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int index = getIndex(arr, 0, arr.length-1, Integer.MAX_VALUE, x);
        
        List<Integer> list = new ArrayList<>();
        list.add(arr[index]);
        
        int count = 1;
        int len = arr.length;
        
        int i = index-1;
        int j = index+1;
        
        while (count < k) {
            int leftVal = i >= 0 ? arr[i] : -100000;
            int rightVal = j < len ? arr[j] : 100000;
            
            int minVal = getMin(x, leftVal, rightVal);
            
            if (leftVal == minVal) {
                list.add(0, leftVal);
                i -= 1;
            }
            else {
                list.add(rightVal);
                j += 1;
            }
            
            count += 1;
        }
        
        return list;
    }
    
    
    int getIndex(int[] arr, int l, int r, int min, int target) {
        if (l > r) return min;
        
        if (l==r) return l;
        
        if (l+1 == r) {
            if (arr[l] == target) return l;
            else if (arr[r] == target) return r;
            else return getMinIndex(target, arr, l, r);
        }
        
        int midIndex = (r-l)/2 + l;
        int midVal = arr[midIndex];
        
        if (midVal == target) {
            return midIndex;   
        }
        else if (midVal < target) {
            min = getMinIndex(target, arr, midIndex, r);
            return getIndex(arr, midIndex, r, min, target);
        }
        else {
            min = getMinIndex(target, arr, l, midIndex);
            return getIndex(arr, l, midIndex, min, target);
        }
    }
    
    
    int getMinIndex(int x, int[] arr, int i, int j) {
        int valOne = arr[i];
        int valTwo = arr[j];
        
        int minVal = getMin(x, valOne, valTwo);
        
        return minVal == valOne ? i : j;
    }
    
    
    int getMin(int x, int a, int b) {
        int aDist = Math.abs(a-x);
        int bDist = Math.abs(b-x);
        
        if (aDist == bDist)
            return Math.min(a, b);
        else if (aDist < bDist)
            return a;
        else
            return b;
    }
}
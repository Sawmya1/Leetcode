class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countNumber=countDigits(n);
        int num=1;
    for(int i=0;i<31;i++){
        if(Arrays.equals(countNumber,countDigits(num))){
            return true;
        }
        num=num<<1;
    }
    
    return false;  
}

 int[] countDigits(int N){
    int[] arr = new int[10];
    while(N>0){
        arr[N%10]++;
        N/=10;
    }
    return arr;

      //   for(int i=0;i<n;i++)
      //   if(Math.pow(2,i)==n)
      //       return true;
      // return false;  
    }
}
class Solution {
    public int[] findOriginalArray(int[] changed) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new java.util.LinkedList();
        
        Arrays.sort(changed);
        
        for(int num : changed){
            if(!q.isEmpty() && num == q.peek()){
                q.poll();
            }else{
                q.offer(num * 2);
                result.add(num);
            }
        }
        
        return !q.isEmpty() ? new int[] {} :  result.stream().mapToInt(i -> i).toArray();
       //  Arrays.sort(changed);
       //  int ar[] = new int[3];
       //  int p1 = changed[0];
       // // int p2 = ar[1];
       //  for(int i=1;i<changed.length;i++){
       //      if(changed[i] == 2*p1){
       //          ar[0] = p1;
       //          break;
       //      }
       //    //  if(changed[i] >= 2*p1)
       //          p1++;
       //  }
       //  return ar;
    }
}
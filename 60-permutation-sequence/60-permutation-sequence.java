class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact = fact * i;
            res.add(i);
        }
        res.add(n);
        String s = "";
        k=k-1;//0th based
        while(true){
            s = s + res.get(k/fact); // index value attach
            res.remove(k/fact);
            if(res.size() == 0)
                break;
            k = k%fact;
            fact = fact / res.size();
        }
        return s;
    }
}
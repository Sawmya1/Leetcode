class Solution {
    private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){

        if(target == 0){
            ans.add(new ArrayList<>(ds)); //make new & and ds in it
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) //not first ele & same as prev
                continue;
            if(arr[i] > target)
                break;
            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds); 
            //can put ind+1 if u want rep combinations
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
class Solution {
    private void findCombinationSum(int ind,int[] candidates,int target,List<List<Integer>> res,List<Integer> ds){
        if(ind == candidates.length){
            if(target == 0)
                res.add(new ArrayList<>(ds));
            return;
        }
        if(candidates[ind] <= target){
            ds.add(candidates[ind]);
            findCombinationSum(ind,candidates,target-candidates[ind],res,ds);
            ds.remove(ds.size()-1);
        }
        findCombinationSum(ind+1,candidates,target,res,ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinationSum(0,candidates,target,res, new ArrayList<>());
        return res;
    }
}
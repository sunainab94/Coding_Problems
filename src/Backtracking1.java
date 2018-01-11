import java.util.*;
import java.lang.*;

import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }

    public void backtrack(int[] candidates, int remain, List<List<Integer>> list, List<Integer> tempList, int start){

        if(remain < 0)
            return;
        else if(remain == 0){
            list.add(new ArrayList<Integer>(tempList));
        }
        else{
            for(int i=start;i<candidates.length;i++){
                tempList.add(candidates[i]);
                backtrack(candidates, remain-candidates[i], list, tempList, i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
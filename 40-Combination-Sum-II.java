import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        sum(0, new ArrayList<>(), target, candidates, ans);

        return ans;
    }

    public void sum(int index, List<Integer> curr, int target,
                    int[] candidates, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // No point continuing
            if (candidates[i] > target) {
                break;
            }

            curr.add(candidates[i]);

            sum(i + 1, curr, target - candidates[i], candidates, ans);

            curr.remove(curr.size() - 1);
        }
    }
}
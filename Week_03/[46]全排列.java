//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 882 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums==null || nums.length==0) return res;
        int[] visited = new int[nums.length];
        List<Integer> path = new ArrayList<>();
        fun(nums, visited, path);
        return res;
    }

    public void fun(int[] nums, int[] visited, List<Integer> path) {
        if (path.size()==nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            path.add(nums[i]);
            visited[i] = 1;
            fun(nums, visited, path);
            visited[i] = 0;
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

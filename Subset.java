// 78. Subsets
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,new ArrayList<>(),ans);
        return ans;      
    }
    public static void helper(int index,int[] nums,List<Integer> subset,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        helper(index+1,nums,subset,ans);

        int element=nums[index];
        subset.add(element);
        helper(index+1,nums,subset,ans);
        subset.remove(subset.size() - 1);
    }

}
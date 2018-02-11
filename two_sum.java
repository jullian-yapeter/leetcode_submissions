import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        int size = nums.length;
        Map <Integer,Integer> look = new HashMap<>();
        for(int i = 0; i<size; i++){
            if(look.containsKey(target-nums[i])){
                solution[0] = look.get(target-nums[i]);
                solution[1] = i;
                return solution;
            }
            else
                look.put(nums[i],i);
        }
        return solution;
    }
}

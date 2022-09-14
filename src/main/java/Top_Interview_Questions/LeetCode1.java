package Top_Interview_Questions;

import java.util.HashMap;

/*
 * Titile: 1. Two Sum
 * Difficulty: Easy
 * Link: 1. Two Sum
 */
public class LeetCode1 {
    /*
     *Given an array of integers nums and an integer target,
     *return indices of the two numbers such that they add up to target.
     *You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *You can return the answer in any order.
     *
     * Constraints:
     *2 <= nums.length <= 104
     *-10^9 <= nums[i] <= 109
     *-10^9 <= target <= 109
     *Only one valid answer exists.
     */
    public int[] twoSum(int[] nums, int target) {
        // the map contains value and its index
        HashMap<Integer, Integer> valuesAndIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Is there value of target minus nums[i] in all keys of map -> find the solution
            if(valuesAndIndexes.containsKey(target-nums[i])){
                return new int[]{valuesAndIndexes.get(target - nums[i]), i};
            }
            else {
                // put value and its index into map
                valuesAndIndexes.put(nums[i],i);
            }
        }
        return null;
    }

    public int[] twoSumOfOtherOne(int[] nums, int target) {
        int front = 0, back = nums.length - 1, sum = 0;
        while (front <= back) {
            int frontI = 0, backI = nums.length - 1;
            while (frontI <= backI) {
                if (backI != frontI) {
                    sum = nums[backI] + nums[frontI];
                    if (sum == target) {
                        return new int[]{backI, frontI};
                    }
                }
                if (frontI != front) {
                    sum = nums[front] + nums[frontI];
                    if (sum == target) {
                        return new int[]{front, frontI};
                    }
                }
                if (front != backI) {
                    sum = nums[front] + nums[backI];
                    if (sum == target) {
                        return new int[]{front, backI};
                    }
                }
                /*

                 */
                if (back != frontI) {
                    sum = nums[back] + nums[frontI];
                    if (sum == target) {
                        return new int[]{back, frontI};
                    }
                }

                if (back != backI) {
                    sum = nums[back] + nums[backI];
                    if (sum == target) {
                        return new int[]{back, backI};
                    }
                }

                frontI++;
                backI--;
            }
            front++;
            back--;
        }
        return null;
    }
}

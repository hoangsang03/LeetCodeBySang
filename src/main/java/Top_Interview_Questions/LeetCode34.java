package Top_Interview_Questions;

/*
 * Difficulty: Medium
 * 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class LeetCode34 {
    /*
     * Given an array of integers nums sorted in non-decreasing order, find the
     * starting and ending position of a given target value.
     *
     * If target is not found in the array, return [-1, -1].
     *
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int lastIndex = nums.length - 1;
        int right = lastIndex;
        int mid;
        int starting = -1;
        int ending = -1;
        int[] result = new int[2];

        while (left <= right) {
            // set value for mid
            mid = (left + right) / 2;
            // check nums[mid] = target ?
            if (nums[mid] == target) {
                // check nums[mid] is unique value that equals target ?
                if (isStarting(mid, nums) && isEnding(mid, nums)) {
                    starting = ending = mid;
                }
                // check nums[mid] is starting ?
                else if (isStarting(mid, nums)) {
                    starting = mid;
                    ending = findEnding(left, right, target, nums);
                }
                // check nums[mid] is ending ?
                else if (isEnding(mid, nums)) {
                    ending = mid;
                    // right = mid - 1;
                    starting = findStarting(left, right, target, nums);

                }

                // if not nums[mid] is between starting and ending!
                else {
                    starting = findStarting(left, mid - 1, target, nums);
                    ending = findEnding(mid + 1, right, target, nums);
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else { // nums[mid] > target
                right = mid - 1;
            }

        }

        // return result of array
        result[0] = starting;
        result[1] = ending;
        return result;

    }

    /*
     * nums[right + 1] = target nums[left] <= target = nums[right]
     *
     * @Return index: if nums[index -1] < nums[index] = target
     */
    private int findStarting(int left, int right, int target, int[] nums) {
        int mid;
        do {
            mid = (left + right) / 2;
            // find value equals target and is isStarting
            if (nums[mid] == target) {
                if (isStarting(mid, nums)) {
                    return mid;
                } else { // nums[mid] == nums[mid+1]
                    right = mid - 1;
                }
            } else { // target > nums[mid]
                left = mid + 1;
            }
        } while (left <= right);
        return mid;
    }

    /*
     * nums[left-1] = target nums[left] = target <= nums[right]
     *
     * @Return index: if nums[index] = target < nums[index +1] Condition: left <=
     * index <= right
     */
    private int findEnding(int left, int right, int target, int[] nums) {
        int mid;
        do {
            mid = (left + right) / 2;
            // find value equals target and is isEnding
            if (nums[mid] == target) {
                if (isEnding(mid, nums)) {
                    return mid;
                } else { // nums[mid] == nums[mid+1]
                    left = mid + 1;
                }
            } else { // target < nums[mid]
                right = mid - 1;
            }
        } while (left <= right);
        return mid;
    }

    /*
     * index: index of value is checked
     *
     * @Return true: if nums[mid] < nums[mid + 1]
     */
    private boolean isEnding(int index, int[] nums) {
        // check if mid is index of last array's element
        if (index == nums.length - 1) {
            return true;
        } else if (nums[index] < nums[index + 1]) {
            return true;
        }
        return false;
    }

    /*
     * @Return true: if nums[mid - 1] < nums[mid]
     */
    private boolean isStarting(int mid, int[] nums) {
        if (mid == 0) {
            return true;
        } else if (nums[mid - 1] < nums[mid]) {
            return true;
        }
        return false;
    }

}

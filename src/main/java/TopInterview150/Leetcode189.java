package TopInterview150;

/**
 * Title: 189. Rotate Array
 * <br> Level: Easy
 * <br> Link: <a href = "https://leetcode.com/problems/rotate-array/">LeetCode 189</a>
 */
public class Leetcode189 {

    public void rotate(int[] nums, int k) {
        int rounds;
        // get k'value is same meaning with k by getting remainder when devide to nums.length
        k = k % nums.length;
        if(k == 0){
            return;
        }
        rounds = findGreatestCommonDivisor(nums.length,k);

        int newValue;

        int waitingValue;

        for (int i = 0; i < rounds; i++) {
            waitingValue = nums[i];
            for (int j = 0; j < nums.length/rounds; j++) {
                // count time of replacing
                // get value that will move
                newValue = waitingValue;
                // find destination position
                i = (i + k) % nums.length;
                // save current value before replacing
                waitingValue = nums[i];
                // put value to destination
                nums[i] = newValue;
            }
        }

    }

    public int findGreatestCommonDivisor(int n, int k) {
        // n > k
        while (k != 0 && n != 0){
            if(n > k){
                n = n % k;
            } else {
                k = k % n;
            }
        }
        return n == 0 ? k : n;
    }
}

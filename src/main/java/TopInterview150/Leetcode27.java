package TopInterview150;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int removedElement = 0;
        for (int i = 0; i < nums.length - removedElement; i++) {
            if(nums[i] == val){
                removedElement++;
                for (int j = nums.length - removedElement; j > i ; j--) {
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        break;
                    } else {
                        removedElement++;
                    }
                }
            }
        }

        return  nums.length - removedElement;
    }
}

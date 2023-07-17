package CrackMyInternship;

public class Problem283MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int k = 0;
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] == 0) {
                    if (len != 1) {
                        for (int j = i; j < len - k - 1; j++) {
                            nums[j] = nums[j + 1];
                        }
                        ++k;
                        nums[len - k] = 0;
                    }
                }
            }
        }
    }
}

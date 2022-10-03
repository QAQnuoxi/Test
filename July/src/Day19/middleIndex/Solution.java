package Day19.middleIndex;

class Solution {
    public int findMiddleIndex(int[] nums) {

        for (int middleIndex= 0; middleIndex<nums.length ; middleIndex++) {
            int left = 0;
            for (int i1 = 0; i1 < middleIndex; i1++) {
                left +=nums[i1];
            }
            int right = 0;
            for (int j = nums.length-1; j > middleIndex; j--) {
                right += nums[j];
            }
            if (left == right) {

                return middleIndex;
            }

        }return -1;

    }
}

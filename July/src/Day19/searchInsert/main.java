package Day19.searchInsert;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int target = 2 ;
        int nums[]={1,3,5,6,4,7,8};
        Arrays.sort(nums);
        System.out.println(new Solution().searchInsert(nums, target));
    }
}

package Day13.runningSum;

public class Solution1 {
    public static void main(String[] args) {
        int[] a =new int[]{2,2,2,2,2,2};
        int[] ints = {2, 2, 3, 4, 5};
        new Solution().runningSum(a);
        for (int j : a) {
            System.out.println(j);
        }
    }
}

//package Day20.intervals;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution {
//    public int [][] merge(int[][] intervals) {
//        ArrayList<Integer> ints = new ArrayList<Integer>();
//        for (int i = 0; i < intervals.length; i++) {
//            for (Integer i1 = 0; i1 < intervals[i].length; i1++) {
//                ints.addAll(ints,intervals[i][0],intervals[i][1],1);
//            }
//        }
//
//        int merge[][]= {{1,12},{243,45},{42,67}};
//        int j = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i]-ints[i+1]==-1){
//                Arrays.fill(merge[j],i+1);
//            }else if (ints[i]-ints[i+1]==1){
//                Arrays.fill(merge[j],i+1);
//            }
//        }
//
//        return merge;
//    }
//}

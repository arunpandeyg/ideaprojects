package Dsa;
//merge intervals


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals){
        List<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length == 0){
            return result.toArray(new  int[0][]);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i : intervals){
            if (i[0] <= end){
                end = Math.max(end, i[1]);
            }
            else {
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        MergeIntervals mi = new MergeIntervals();
        System.out.println(Arrays.deepToString(mi.merge(intervals)));
        int[][] intervals1 = {{1,4}, {4,5}};
        System.out.println(Arrays.deepToString(mi.merge(intervals1)));

    }
}

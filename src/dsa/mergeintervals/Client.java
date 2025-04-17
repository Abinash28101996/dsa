package dsa.mergeintervals;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
//        intervals.add(new Interval(15, 20));
//        intervals.add(new Interval(20, 40));
        SortInterval sortInterval = new SortInterval(intervals);
        List<Interval> sortedIntervals = sortInterval.getSortedIntervals();
//        for (Interval interval : sortedIntervals) {
//            System.out.println(interval.getStart() + " " + interval.getEnd());
//        }
        MergeIntervals mergeIntervals = new MergeIntervals(sortedIntervals, new Interval(2, 5));
        List<Interval> mergedIntervals = mergeIntervals.getMergedIntervals();
        for (Interval interval : mergedIntervals) {
            System.out.println(interval.getStart() + " " + interval.getEnd());
        }
    }
}

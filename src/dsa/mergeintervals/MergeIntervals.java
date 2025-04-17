package dsa.mergeintervals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeIntervals {
    private List<Interval> intervals;
    private Interval mergingInterval;

    public MergeIntervals(List<Interval> intervals, Interval mergingInterval) {
        this.intervals = intervals;
        this.mergingInterval = mergingInterval;
    }

    public List<Interval> getMergedIntervals() {
        List<Interval> mergedIntervals = new ArrayList<Interval>();
        int n = intervals.size();
        for (int i = 0; i < n; i++) {
            if (intervals.get(i).getEnd() < mergingInterval.getStart()) {
                mergedIntervals.add(intervals.get(i));
            }
            else if (intervals.get(i).getStart() > mergingInterval.getEnd()) {
                mergedIntervals.add(mergingInterval);

                for (int j = i; j < n; j++) {
                    mergedIntervals.add(intervals.get(j));
                }
                return mergedIntervals;
            }
            else {
                mergingInterval.setStart(Math.min(intervals.get(i).getStart(), mergingInterval.getStart()));
                mergingInterval.setEnd(Math.max(intervals.get(i).getEnd(), mergingInterval.getEnd()));
            }
        }
        mergedIntervals.add(mergingInterval);
        return mergedIntervals;
    }
}

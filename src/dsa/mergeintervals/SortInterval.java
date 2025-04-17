package dsa.mergeintervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInterval {
    private List<Interval> intervals;
    public SortInterval(List<Interval> intervals) {
        this.intervals = intervals;
    }
    public List<Interval> getSortedIntervals() {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.getStart() < o2.getStart()) return -1;
                else if(o1.getStart() > o2.getStart()) return 1;
                else return 0;
            }
        });
        return intervals;
    }
}

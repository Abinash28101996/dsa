package dsa.twosum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public List<Integer> findTwoNumbers(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    break;
                }
            }
        }
        return list;
    }
}

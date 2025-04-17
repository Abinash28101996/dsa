package dsa.longestsubstringwithoutrepeat;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeat {
    private String string;
    public LongestSubStringWithoutRepeat(String string) {
        this.string = string;
    }

    public int getLongestSubStringWithoutRepeat() {
        int length = string.length();
        Set<Character> set = new HashSet<>();
//        int left = 0;
//        int right = 0;
//        int ans = 0;
        int left = 0, right = 0, ans = 0;
        while(right < length) {
            if(set.contains(string.charAt(right))) {
                set.remove(string.charAt(left));
                left++;
            }
            else {
                set.add(string.charAt(right));
                right++;
                ans = Math.max(ans, set.size());
            }
        }
        return ans;
    }
}

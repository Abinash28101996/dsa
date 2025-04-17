package dsa.longestsubstringwithoutrepeat;

public class Client {
    public static void main(String[] args) {
        LongestSubStringWithoutRepeat longestSubStringWithoutRepeat
                = new LongestSubStringWithoutRepeat("abcabcbb");
        int longestSubStringWithoutRepeat1
                = longestSubStringWithoutRepeat.getLongestSubStringWithoutRepeat();
        System.out.println(longestSubStringWithoutRepeat1);
    }
}

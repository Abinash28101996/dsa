package dsa.reversestring;

public class ReverseString {

    private String str;
    public ReverseString(String str) {
        this.str = str;
    }

    public String reverse() {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

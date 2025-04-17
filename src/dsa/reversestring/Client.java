package dsa.reversestring;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Please enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
//        ReverseString reverseString = new ReverseString(s);
//        System.out.println(reverseString.reverse());System.out.println(s.getClass().getName());
//        StringBuilder stringBuilder = new StringBuilder(s);
//        System.out.println(stringBuilder.getClass().getName());
        StringBuilder builder = new StringBuilder(s);
//        int length = builder.length();
//        int leftIndex = 0;
//        int rightIndex = length - 1;
//        while (leftIndex < rightIndex) {
//            char temp = builder.charAt(leftIndex);
//            builder.setCharAt(leftIndex, builder.charAt(rightIndex));
//            builder.setCharAt(rightIndex, temp);
//            leftIndex++;
//            rightIndex--;
//        }
//        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }
}

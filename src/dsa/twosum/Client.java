package dsa.twosum;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Please enter the target: ");
        int target = sc.nextInt();

        TwoSum twoSum = new TwoSum();
        List<Integer> twoNumbers = twoSum.findTwoNumbers(nums, target);
        System.out.println(twoNumbers);
    }
}

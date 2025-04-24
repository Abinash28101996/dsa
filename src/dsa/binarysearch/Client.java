package dsa.binarysearch;

public class Client {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        int index = search.binarySearch(array, target);
        System.out.println(index);
    }
}

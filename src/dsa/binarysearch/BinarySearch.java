package dsa.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                index = mid;
                return index;
            }
            if (array[mid] > value) {
                right = mid - 1;
            }
            if (array[mid] < value) {
                left = mid + 1;
            }
        }
        return index;
    }
}

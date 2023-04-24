package com.demo.cleancode.examples.comments.goodcomments;

public class ExplanationOfIntent {

    // We're using a binary search algorithm here because the array is already sorted, which will give us O(log n) performance.
    public int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

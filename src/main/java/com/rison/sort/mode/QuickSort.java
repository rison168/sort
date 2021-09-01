package com.rison.sort.mode;

/**
 * @author : Rison 2021/9/1 上午11:06
 * 快速排序
 */
public class QuickSort {
    public static int[] quickSort(int[] array, int low, int high) {
        int left = low;
        int right = high;
        int temp = array[low];
        while (left < right) {
            while (left < right && array[right] >= temp) {
                right--;
            }
            if (left < right) {
                array[left] = array[right];
                left++;
            }
            while (left < right && array[left] <= temp) {
                left++;
            }
            if (left < right) {
                array[right] = array[left];
                right--;
            }
        }
        if (left == right) {
            array[left] = temp;
        }
        if (left > low) {
            quickSort(array, low, left - 1);
        }
        if (right < high) {
            quickSort(array, left + 1, high);
        }
        return array;
    }

    // 打印数组的方法
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {4, 5, 3, 7, 2, 9, 4, 2, 7};
        print(quickSort(data, 0, data.length - 1));
    }
}

package com.rison.sort.mode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : Rison 2021/9/2 上午8:23
 */
public class Test {
    public static void main(String[] args) {
        int[] data = {4, 5, 3, 7, 2, 9, 4, 2, 7, 10, 11, 1};
//        bubbleSort(data);
//        System.out.println(Arrays.toString(data));

//        selectSort(data);
//        System.out.println(Arrays.toString(data));

//        insertSort(data);
//        System.out.println(Arrays.toString(data));

//        quickSort(data, 0, data.length - 1);
//        System.out.println(Arrays.toString(data));

//        shellSort(data);
//        System.out.println(Arrays.toString(data));

        mergeSort(data, 0, data.length - 1, new int[data.length]);
        System.out.println(Arrays.toString(data));


    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        int left = low;
        int right = high;
        int first = array[left];

        while (left < right) {
            while (left < right && array[right] >= first) {
                right--;
            }
            if (array[right] < first) {
                array[left] = array[right];
            }
            while (left < right && array[left] <= first) {
                left++;
            }
            if (array[left] > first) {
                array[right] = array[left];
            }
        }
        if (left == right) {
            array[left] = first;
        }
        if (left > low) {
            quickSort(array, low, left - 1);
        }
        if (right < high) {
            quickSort(array, left + 1, high);
        }

    }

    public static void shellSort(int[] array) {
        for (int l = array.length / 2; l > 0; l = l / 2) {
            for (int i = l; i < array.length; i = i + l) {
                int temp = array[i];
                int j = i - l;
                while (j >= 0 && temp < array[j]) {
                    array[j + l] = array[j];
                    j = j - l;
                }
                array[j + l] = temp;
            }
        }
    }

    public static void mergeSort(int[] array, int left, int right, int[] temp){
        if (left >= right){
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(array, left, mid, temp);
        mergeSort(array, mid + 1, right, temp);
        merge(array, left, mid, right, temp);
    }

    public static void merge(int[] array, int left, int mid, int right, int[] temp){
        int l = left;
        int m = mid + 1;
        int n = 0;
        while (l <= mid && m <= right){
            if (array[l] < array[m]){
                temp[n++] = array[l++];
            }else {
                temp[n++] = array[m++];
            }
        }
        while (l <= mid){
            temp[n++] = array[l++];
        }
        while (m <= right){
            temp[n++] = array[m++];
        }
        n = 0;
        while (left <= right){
            array[left++] = temp[n++];
        }
    }


}

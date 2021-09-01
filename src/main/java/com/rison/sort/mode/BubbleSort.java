package com.rison.sort.mode;

/**
 * @author : Rison 2021/8/31 下午4:16
 * 冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }

    public static void main(String[] args) {
        int[] data = {4, 5, 3, 7, 2, 9, 4, 2, 7};
        bubbleSort(data);

    }
}

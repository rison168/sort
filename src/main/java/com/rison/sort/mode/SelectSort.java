package com.rison.sort.mode;

/**
 * @author : Rison 2021/9/1 上午8:57
 * 选择排序
 */

public class SelectSort {

    public static void selectSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (temp > data[j]) {
                    temp = data[j];
                    index = j;
                }
            }
            data[index] = data[i];
            data[i] = temp;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = {4, 5, 3, 7, 2, 9, 4, 2, 7};
        selectSort(data);

    }
}

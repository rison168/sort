package com.rison.sort.mode;

/**
 * @author : Rison 2021/9/1 上午8:57
 * 选择排序
 */

public class InsertSort {

    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while(j >= 0 && temp < data[j]){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;

        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = {4, 5, 3, 7, 2, 9, 4, 2, 7};
        insertSort(data);


    }
}

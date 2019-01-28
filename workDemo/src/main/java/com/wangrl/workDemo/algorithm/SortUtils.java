package com.wangrl.workDemo.algorithm;

public class SortUtils {
    public static final int[] data = {6,10,113,22,9,24,11};
    public static void selectSort(){
        int length = data.length;
        for(int i = 0;i<length;i++){
            int minIndex = i;
            for(int j=i+1;j<length;j++){
                if (data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            int min = data[minIndex];
            data[minIndex] = data[i];
            data[i] = min;
        }
    }
    public static void main(String[] args){
        selectSort();
        for (int temp : data){
            System.out.print(temp+" ");
        }
    }
}

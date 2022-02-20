package com.bmc.test.dwp;

import java.util.Arrays;

public class MonotonicArray {

    // Monotonic array
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 9,8,6,4,0,1 };
        boolean increase = true;
        boolean decrease= true;
        for (int i=0; i<arr.length -1;i++)
        {
            if (arr[i] > arr[i+1]){
                increase = false;
            }
            if (arr[i] < arr[i+1]){
                decrease = false;
            }
        }
        System.out.println(increase || decrease);
    }
}

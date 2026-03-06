package org.campus02.sorting;

import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {

        int[] arr = {9,8, 7, 1};
        System.out.println(Arrays.toString(arr));

        ArrayHelper.arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));

    }
}

package org.campus02.sorting;

import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {

        /*int[] arr = {9,8, 7, 1};
        System.out.println(Arrays.toString(arr));

        ArrayHelper.arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
         */

        Car[] cars = new Car[4];
        cars[0] = new Car("VW", 2025, 12_533);
        cars[1] = new Car("Audi", 2023, 67_812);
        cars[2] = new Car("Tesla", 2026, 512);
        cars[3] = new Car("Audi", 2024, 36_123);
        // STRG+D

        ArrayHelper.arrangeOrder(cars);

        System.out.println(Arrays.toString(cars));


    }
}

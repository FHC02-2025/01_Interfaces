package org.campus02.sorting;

public class ArrayHelper {

    public static void arrangeOrder(int[] numbers) {

        boolean exchanged = true;

        while (exchanged /* == true*/) {
            exchanged = false;
            // Schritt 1
            for (int i = 0; i < numbers.length - 1; i++) {
                // 9, 8, 7, 1
                if (numbers[i] > numbers[i + 1]) { // Schritt 2
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1]; // 8, 8, 7, 1
                    numbers[i + 1] = temp; // 8, 9, 7, 1
                    exchanged = true;
                }
            }
        }
        // 8, 7, 1, 9
    }

    public static void arrangeOrder(Sortable[] elements) {

        boolean exchanged = true;

        while (exchanged /* == true*/) {
            exchanged = false;
            // Schritt 1
            for (int i = 0; i < elements.length - 1; i++) {
                // 9, 8, 7, 1
                if (elements[i].sortValue() > elements[i + 1].sortValue()) { // Schritt 2
                    Sortable temp = elements[i];
                    elements[i] = elements[i + 1]; // 8, 8, 7, 1
                    elements[i + 1] = temp; // 8, 9, 7, 1
                    exchanged = true;
                }
            }
        }
        // 8, 7, 1, 9
    }

    public static void arrangeOrder2(Sortable[] elements) {

        boolean exchanged;

        do {
            exchanged = false;
            // Schritt 1
            for (int i = 0; i < elements.length - 1; i++) {
                // 9, 8, 7, 1
                if (elements[i].sortValue() > elements[i + 1].sortValue()) { // Schritt 2
                    Sortable temp = elements[i];
                    elements[i] = elements[i + 1]; // 8, 8, 7, 1
                    elements[i + 1] = temp; // 8, 9, 7, 1
                    exchanged = true;
                }
            }
        } while (exchanged == true);
        // 8, 7, 1, 9 
    }

//    public static void arrangeOrderKilometer(Car[] cars) {
//
//        boolean exchanged = true;
//
//        while (exchanged /* == true*/) {
//            exchanged = false;
//            // Schritt 1
//            for (int i = 0; i < cars.length - 1; i++) {
//                // 9, 8, 7, 1
//                if (cars[i].getDrivenKilometer() > cars[i + 1].getDrivenKilometer()) { // Schritt 2
//                    Car temp = cars[i];
//                    cars[i] = cars[i + 1]; // 8, 8, 7, 1
//                    cars[i + 1] = temp; // 8, 9, 7, 1
//                    exchanged = true;
//                }
//            }
//        }
//        // 8, 7, 1, 9
//    }

}

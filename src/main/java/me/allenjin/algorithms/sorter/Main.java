package me.allenjin.algorithms.sorter;

import java.util.Random;

/**
 * Main
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public class Main {

    private static void print(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static Sorter sorterBuilder(int code) {
        switch (code) {
            case 0:
                return new ChooseSorter();
            case 1:
                return new InsertSorter();
            case 2:
                return new MergeSorter();
            case 3:
                return new QuickSorter();
            default:
                return new ChooseSorter();
        }
    }

    private static Comparable[] arrayGenerator(int length) {
        Comparable[] myIntegerArray = new Comparable[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            MyInteger myInteger = new MyInteger(random.nextInt(100));
            myIntegerArray[i] = myInteger;
        }
        System.out.println("Source Sort Array: ");
        print(myIntegerArray);
        System.out.println();
        return myIntegerArray;
    }

    public static void main(String[] args) {
        Comparable[] arrays = arrayGenerator(10);
        Sorter sorter = sorterBuilder(3);
        Comparable[] result = sorter.sort(arrays);
        System.out.println("Sorted Array: ");
        print(result);
    }
}

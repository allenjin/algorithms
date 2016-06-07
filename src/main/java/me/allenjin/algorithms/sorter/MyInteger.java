package me.allenjin.algorithms.sorter;

/**
 * MyInteger
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public class MyInteger implements Comparable<MyInteger> {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public boolean compare(MyInteger object) {
        return this.value >= object.getValue();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

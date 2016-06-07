package me.allenjin.algorithms.sorter;

/**
 * Sorter
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public interface Sorter<T extends Comparable> {

    T[] sort(T[] array);
}

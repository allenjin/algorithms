package me.allenjin.algorithms.sorter;

/**
 * MergeSorter
 * 归并排序 时间复杂度: O( n*log(n) )
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public class MergeSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] array) {

        mergeSort(array, 0, array.length - 1);

        return array;
    }

    private void mergeSort(Comparable[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, 0, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(Comparable[] array, int left, int middle, int right) {
        int lp = left;
        int rp = middle + 1;
        int index = 0;
        Comparable[] tmp = new Comparable[right - left + 1];
        while (lp <= middle && rp <= right) {
            if (array[lp].compare(array[rp])) {
                tmp[index] = array[rp++];
            } else {
                tmp[index] = array[lp++];
            }
            index++;
        }

        while (lp <= middle) {
            tmp[index++] = array[lp++];
        }
        while (rp <= right) {
            tmp[index++] = array[rp++];
        }
        for (int i = 0; i < tmp.length; i++) {
            array[left + i] = tmp[i];
        }

    }
}

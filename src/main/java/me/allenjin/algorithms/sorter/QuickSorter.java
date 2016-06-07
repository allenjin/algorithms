package me.allenjin.algorithms.sorter;

/**
 * QuickSorter
 *
 * @author Allen Jin
 * @date 2016/06/06
 */
public class QuickSorter implements Sorter<Comparable> {

    @Override
    public Comparable[] sort(Comparable[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(Comparable[] array, int left, int right) {
        if (left < right) {
            Comparable base = array[left];
            int lp = left;
            int rp = right;
            while (lp < rp) {

                while (array[rp].compare(base) && lp < rp) {
                    rp--;
                }

                if (lp < rp) {
                    array[lp++] = array[rp];
                }

                while (!array[lp].compare(base) && lp < rp) {
                    lp++;
                }
                if (lp < rp) {
                    array[rp--] = array[lp];
                }
            }
            array[lp] = base;
            quickSort(array, left, lp);
            quickSort(array, lp + 1, right);
        }
    }
}

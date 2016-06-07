package me.allenjin.algorithms.sorter;

/**
 * InsertSorter
 * 插入排序 时间复杂度: O( n*n )
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public class InsertSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] array) {

        //从前往后在剩余元素中选择第一个元素作为当前元素
        for (int i = 0; i <= array.length - 1; i++) {

            //将当前元素从后往前比较插入到已排好序的元素中
            for (int j = i; j > 0; j--) {
                if (array[j - 1].compare(array[j])) {
                    Comparable tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        return array;
    }
}

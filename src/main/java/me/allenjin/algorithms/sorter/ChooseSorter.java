package me.allenjin.algorithms.sorter;

/**
 * ChooseSorter
 * 选择排序 时间复杂度: O( n*n )
 *
 * @author Allen Jin
 * @date 2016/06/01
 */
public class ChooseSorter implements Sorter<Comparable> {

    @Override
    public Comparable[] sort(Comparable[] array) {

        //每次选择后,剩余元素中去掉最后一个元素,剩余一个元素时结束
        for (int i = array.length - 1; i > 0; i--) {

            //每次选择剩余元素中最大的元素放到剩余元素的最后
            for (int j = 0; j < i; j++) {
                if (array[j].compare(array[j + 1])) {
                    Comparable tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}

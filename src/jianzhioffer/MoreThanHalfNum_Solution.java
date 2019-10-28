package jianzhioffer;

import static java.util.Arrays.sort;

/**
 * @author chenlijun
 * @date 2019-10-27 18:51
 * <p>
 * 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) return 0;
        if (array.length == 1) return array[0];
        sort(array);
        int index = array.length / 2;
        int number = array[index], count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        if (count > index) {
            return number;
        } else {
            return 0;
        }
    }
}

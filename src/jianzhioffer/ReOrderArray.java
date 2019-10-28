package jianzhioffer;

import java.util.ArrayList;

/**
 * @author chenlijun
 * @date 2019-10-27 17:21
 * <p>
 * 调整数组顺序使奇数位于偶数前面
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) return;
        int[] reult = new int[array.length];
        int index = 0;
        //先筛选奇数在筛选偶数
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                reult[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                reult[index] = array[i];
                index++;
            }
        }


        for (int i = 0; i < array.length; i++) {
            array[i] = reult[i];
        }

    }

    public static void main(String[] arg) {
        new ReOrderArray().reOrderArray(new int[]{1, 3, 5, 7, 2, 4, 6});
    }
}

package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author chenlijun
 * @date 2019-10-23 21:10
 * 扑克牌顺子
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,
 * 2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,
 * 想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
 * 他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 * LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */
public class IsContinuous {
    public static boolean isContinuous(int[] numbers) {

        quickSort(numbers, 0, 4);
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                continue;
            } else if (numbers[i] == numbers[i + 1]) {
                return false;
            } else {
                sum += (numbers[i + 1] - numbers[i]);
            }
        }
        if (sum <= 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void quickSort(int a[], int l, int r) {
        if (l >= r)
            return;
        int i = l;
        int j = r;
        int key = a[l];//选择第一个数为key
        while (i < j) {

            while (i < j && a[j] >= key)//从右向左找第一个小于key的值
                j--;
            if (i < j) {
                a[i] = a[j];
                i++;
            }

            while (i < j && a[i] < key)//从左向右找第一个大于key的值
                i++;

            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i - 1);//递归调用
        quickSort(a, i + 1, r);//递归调用
    }

    public static void main(String[] args) {
        System.out.println(isContinuous(new int[]{1,2,4,3,3}));
    }
}

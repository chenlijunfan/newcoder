package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 16:46
 * <p>
 * 矩阵覆盖
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int RectCover(int target) {
        if (target <= 2) return target;
        return  RectCover(target - 1)+RectCover(target-2);
    }
}

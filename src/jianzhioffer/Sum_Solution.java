package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-24 13:36
 * <p>
 * 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean is = sum > 0 && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}

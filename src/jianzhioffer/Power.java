package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 17:09
 * <p>
 * 数值的整数次方
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * <p>
 * 保证base和exponent不同时为0
 */
public class Power {
    public double Power(double base, int exponent) {
        boolean flag;
        double result = 1;
        if (exponent < 0) {
            flag = false;
            exponent *= -1;
        } else {
            flag = true;
        }

        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        if (flag) {
            return result;
        } else {
            return 1 / result;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Power().Power(-3, -2));
    }
}

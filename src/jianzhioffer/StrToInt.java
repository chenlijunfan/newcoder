package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-25 10:10
 * <p>
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str.length() < 1) return 0;
        int start = 0, symbol = 0, result = 0;
        if (str.charAt(0) == '-') {
            start = 1;
            symbol = -1;
        } else if (str.charAt(0) == '+') {
            start = 1;
            symbol = 1;
        }
        for (; start < str.length(); start++) {
            int digital = str.charAt(start) - '0';
            if (digital < 0 || digital > 9) return 0;
            result = result * 10 + digital;
            //越界判断
            if (symbol == -1) {
                if (result * symbol - Integer.MIN_VALUE < 0) return 0;
            } else {
                if (result - Integer.MAX_VALUE > 0) return 0;
            }
        }
        if (symbol == 0) {
            return result;
        }
        return result * symbol;
    }

    public static void main(String[] args) {
        System.out.println(new StrToInt().StrToInt("2147483648"));
    }
}

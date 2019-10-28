package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 14:54
 * <p>
 * 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 */
public class Fibonacci {
    //F(1)=1,F(2)=1,F(n)=F(n-1)+F(n-2)
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 14:58
 * <p>
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        //f(1)=1,f(2)=2,f(3)=3,f(n)=f(n-1)+f(n-2)
        if (target <= 2) {
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}

package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-27 16:32
 * <p>
 * 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        //n级台阶每次跳台阶有n种跳法
        if (target <= 2) return target;
        return 2* JumpFloorII(target - 1);
    }
}

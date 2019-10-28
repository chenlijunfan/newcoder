package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-24 15:28
 * <p>
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class CutRope {

    public int cutRope(int target) {
        //在主段中，分段必须是n>2
        if (target <= 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }

        return cutRepo2(target);
    }

    //当前为分段，可以只分1段
    public int cutRepo2(int target) {
        int max = target;
        if (target <= 3) {
            return target;
        }
        //当前段位k时，只需要求接下来target-k的最优
        for (int i = 1; i <= target / 2; i++) {
            int sum = i * cutRepo2(target - i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new CutRope().cutRope(9));
    }

}

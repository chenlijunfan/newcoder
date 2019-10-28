package jianzhioffer;

/**
 * @author chenlijun
 * @date 2019-10-26 11:48
 * <p>
 * 二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {

    public boolean Find(int target, int[][] array) {
        if (array == null || array.length <= 0)
            return false;
        for (int i = 0; i < array.length; i++) {
            //当前行的最大值如果大于target,则在当前行中
            if (array[i][array[i].length - 1] >= target) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(new Find().Find(16,new int[][]{}));
    }
}

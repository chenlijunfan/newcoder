package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author chenlijun
 * @date 2019-10-27 19:23
 * <p>
 * 字符串的排序
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        sortString(result, str.toCharArray(), 0);
        //Collections.sort(result);
        return result;
    }

    //当做每次string的首字符与后面的字符调换顺序
    private ArrayList<String> sortString(ArrayList<String> result, char[] chars, int pos) {

        if (pos == chars.length - 1) {
            String lastString = String.valueOf(chars);
            // indexOf() 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
            // 因为可能有字符重复，所以要做此判断
            if (result.indexOf(lastString) < 0) {
                result.add(lastString);
            }
        }

        for (int i = pos; i < chars.length; i++) {

            char temp = chars[pos];
            chars[pos] = chars[i];
            chars[i] = temp;

            sortString(result, chars, pos + 1);
            //调换位置之后需要在调换回来
            temp = chars[pos];
            chars[pos] = chars[i];
            chars[i] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        for (String s : new Permutation().Permutation("")) {
            System.out.println(s);
        }
    }
}

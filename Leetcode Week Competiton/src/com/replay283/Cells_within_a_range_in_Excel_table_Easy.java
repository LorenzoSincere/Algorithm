package com.replay283;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lorenzo
 * @date 2022/03/06 21:50
 **/
public class Cells_within_a_range_in_Excel_table_Easy {
    public static void main(String[] args) {
        String s1 = "K1:L2";
        String s2 = "A1:F1";

        List<String> result01 = cellsInRange(s1);
        List<String> result02 = cellsInRange(s2);

        System.out.println(result01);
        System.out.println(result02);
    }

    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();

        // 字符串拆分 分别进行获取起始表格位置 以及 截至表格位置 用来获取范围
        String[] params = s.split(":");
        // 获取对应起始列的字符
        char col1 = params[0].charAt(0);
        // 获取对应起始行的行数
        int row1 = Integer.parseInt(params[0].substring(1));

        // 获取对应截至列的字符
        char col2 = params[1].charAt(0);
        // 获取对应截至行的行数
        int row2 = Integer.parseInt(params[1].substring(1));

        //main
        for (char c = col1; c <= col2; c++) {
           int j = row1;
            for (int i = j; i <= row2; i++) {
                StringBuilder list = new StringBuilder();
                list.append(c).append(j++);
                res.add(list.toString());
            }
        }
        return res;
    }
}

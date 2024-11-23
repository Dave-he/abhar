package org.harm.utils;

import java.util.List;

/**
 * @author hyx
 * @date 2024/11/17
 */
public class NamePriceUtils {

    /**
     * 五格数理的计算方法
     */
    public static List<Integer> good =
            List.of(1, 3, 5, 7, 8, 11, 13, 15, 16, 18, 21, 23, 24, 25, 31, 32, 33, 35, 37, 39, 41, 45, 47, 48, 52,
                    57, 61, 63, 65, 67, 68, 81);

    public static List<Integer> secondGood = List.of(6, 17, 26, 27, 29, 30, 38, 49, 51, 55, 58, 71, 73, 75);

    public static String goodJudge(int top) {
        if (good.contains(top)) {
            return "吉";
        }
        if (secondGood.contains(top)) {
            return "次吉";
        }
        return "凶";
    }

    public static int priceJudge(int top) {
        if (good.contains(top)) {
            return 20;
        }
        if (secondGood.contains(top)) {
            return 10;
        }
        return 0;
    }

    public static void main(String[] args) {
        Ge ge = getGe("李欧二");
        ge.getGood();
    }

    public static Ge getGe(String name) {
        String firstName = getName(name);
        String secondName = name.replace(firstName, "");
        int a = getLen(firstName) + 1;
        int b = getLen(firstName) + getLen(secondName.substring(0, 1)) ;
        int c =  getLen(firstName) + getLen(secondName.substring(1, 2)) ;
        int d =  getLen(firstName)+ getLen(secondName.substring(0, 1))  + getLen(secondName.substring(1, 2)) ;
        int e = d - a;
        return new Ge(a, b, c, d, e);
    }

    private static int getLen(String name) {
        int len = 0;
        for (int i = 0; i < name.length(); i++) {
            len += StrokeUtils.strokeCount(name.charAt(i));
        }
        return len;
    }


    /**
     * 返回名字姓氏的长度
     *
     * @param name 姓名
     * @return 姓氏长度
     */
    public static String getName(String name) {
        // 这里列举了一些常见的复姓
        for (String duplexSurname : duplexSurnames) {
            if (name.startsWith(duplexSurname)) {
                return duplexSurname;
            }
        }
        return name.charAt(0) + "";
    }


    /**
     * 中国现存的81个复姓
     */
    private final static String[] duplexSurnames =
            {"欧阳", "太史", "端木", "上官", "司马", "东方", "独孤", "南宫", "万俟", "闻人", "夏侯", "诸葛", "尉迟",
                    "公羊", "赫连", "澹台", "皇甫", "宗政", "濮阳", "公冶", "太叔", "申屠", "公孙", "慕容", "仲孙",
                    "钟离", "长孙", "宇文", "司徒", "鲜于", "司空", "闾丘", "子车", "亓官", "司寇", "巫马", "公西",
                    "颛孙", "壤驷", "公良", "漆雕", "乐正", "宰父", "谷梁", "拓跋", "夹谷", "轩辕", "令狐", "段干",
                    "百里", "呼延", "东郭", "南门", "羊舌", "微生", "公户", "公玉", "公仪", "梁丘", "公仲", "公上",
                    "公门", "公山", "公坚", "左丘", "公伯", "西门", "公祖", "第五", "公乘", "贯丘", "公皙", "南荣",
                    "东里", "东宫", "仲长", "子书", "子桑", "即墨", "达奚", "褚师", "吴铭"};
}

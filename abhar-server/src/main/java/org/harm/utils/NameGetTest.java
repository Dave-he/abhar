package org.harm.utils;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.core.io.FileUtil;

/**
 * @author hyx
 * @date 2024/11/17
 */
public class NameGetTest {
    public static int index = 0;

    /**
     * 字库
     */
    public static final Map<String, List<String>> MAP = new HashMap<>() {
        {
            put("金", List.of("楚", "思", "善", "瑧", "千", "诗", "紫", "青", "书", "舒", "靓", "然", "玿", "悦", "钰",
                    "玉", "珮", "静"));
            put("土", List.of("墨", "圣", "羽", "阳", "韵", "辰", "怡", "亦", "园", "容", "艳", "爱", "圆", "依", "宛",
                    "维", "娅"));
            put("水",
                    List.of("潇", "沁", "沐", "冬", "玫", "雪", "涵", "清", "云", "熙", "霖", "璞", "霓", "洁", "洋"));

            put("火", List.of("晨", "甜", "朗", "晞", "琅", "晗", "星", "迪", "珍", "南", "恬", "珏", "玲", "俪", "郦",
                    "晴", "晶", "智", "璇", "瑾", "瑶", "曦", "璟", "曜", "明"));

        }
    };

    public static void main(String[] args) {
        getName("何", "金", "水");
        getName("何", "水", "金");
        getName("何", "金", "金");
        getName("何", "土", "金");
        getName("何", "金", "土");
    }

    private static void getName(String firstName, String second, String last) {
        System.out.printf("[%s + : %s]\n", second, last);
        FileUtil.appendLines(List.of(String.format("五行属性-[%s + : %s]", second, last)), "name.txt",
                Charset.defaultCharset());
        for (String s1 : MAP.get(second)) {
            //            if (ChineseToneUtils.getToneNumber(s1) < 3) {
            //                continue;
            //            }
            for (String s2 : MAP.get(last)) {
                if (s1.equals(s2)) {
                    continue;
                }
                if (ChineseToneUtils.getToneNumber(s1) == ChineseToneUtils.getToneNumber(s2)) {
                    continue;
                }
                try {
                    System.out.println(index + " : " + firstName + s1 + s2);
                    Ge g = NamePriceUtils.getGe(firstName + s1 + s2);
                    int good = g.getGood();
                    if (good < 50) {
                        continue;
                    }
                    index++;
                    FileUtil.appendLines(List.of(index + " : " + firstName + s1 + s2 + "  天格分数：" + good),
                            "name.txt", Charset.defaultCharset());
                    FileUtil.appendLines(List.of(index + "    " +  firstName + s1 + s2 + "    " + good), "name.csv", Charset.defaultCharset());
                } catch (Exception e) {
                    System.out.println(index + " : " + firstName + s1 + s2 + e.getMessage());
                }

            }
        }
    }

}

package org.harm.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @author hyx
 * @date 2024/11/17
 */
public class ChineseToneUtils {

    private static HanyuPinyinOutputFormat outputFormat;

    static  {
        outputFormat = new HanyuPinyinOutputFormat();
        outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        outputFormat.setToneType(HanyuPinyinToneType.WITH_TONE_NUMBER);
        outputFormat.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE);
    }

    public static int getToneNumber(String chinese) {
        try {
            String pinyinString = PinyinHelper.toHanYuPinyinString(chinese, outputFormat, "", true);
            System.out.println(pinyinString);
            return pinyinString.charAt(pinyinString.length() - 1) - '0';
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String chinese = "文";
        System.out.println( getToneNumber(chinese));


    }

}

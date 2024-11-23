package org.harm.utils;

import static org.harm.utils.NamePriceUtils.goodJudge;
import static org.harm.utils.NamePriceUtils.priceJudge;

/**
 * @author hyx
 * @date 2024/11/19
 */
public record Ge(int a, int b, int c,int d, int e) {

    int getGood() {
        System.out.println("天格：" + goodJudge(a));
        System.out.println("人格：" + goodJudge(b));
        System.out.println("地格：" + goodJudge(c));
        System.out.println("总格：" + goodJudge(d));
        System.out.println("外格：" + goodJudge(e));

        int price = priceJudge(a)
                + priceJudge(b)
                + priceJudge(c)
                + priceJudge(d)
                + priceJudge(e);
        System.out.println("最终得分 "
                +price
        );
        return price;
    }
}

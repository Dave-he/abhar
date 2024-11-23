package org.harm.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 物品
 *
 * @author hyx
 * @date 2024/11/5
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity(name = "goods_item")
public class Item extends BaseEntity {

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "img_list")
    private String imgList;

    @Column(name = "purchase_price")
    private Long purchasePrice; // 购买价格

    @Column(name = "purchase_currency")
    private String purchaseCurrency; // 购买币种

    @Column(name = "quantity")
    private Integer quantity; // 库存数量

    @Column(name = "unit", length = 10)
    private String unit; // 单位

    @Column(name = "remark")
    private String remark;

    @Column(name = "produce_time")
    private Timestamp producTime; // 生产日期
    @Column(name = "expire_time")
    private Timestamp expireTime; // 有效期

    @Column(name = "status")
    private Integer status; // 状态
}

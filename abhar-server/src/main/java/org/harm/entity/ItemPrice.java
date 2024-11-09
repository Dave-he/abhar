package org.harm.entity;

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
@Entity(name = "item_price")
public class ItemPrice extends BaseEntity {

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "local_price")
    private Long localPrice;

    @Column(name = "usd_price")
    private Long usdPrice;

    @Column(name = "local_date")
    private String localDate;
}

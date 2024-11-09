package org.harm.entity;

import jakarta.json.Json;
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
public class GoodsItem extends BaseEntity {

    @Column(name = "good_id")
    private Long goodId;

    @Column(name = "note")
    private String note;

    @Column(name = "img")
    private String img;
}

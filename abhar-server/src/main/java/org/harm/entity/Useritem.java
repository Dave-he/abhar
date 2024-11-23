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
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "user_item")
public class Useritem extends BaseEntity {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "item_id")
    private String item_id;

    @Column(name = "good_id")
    private String good_id;
}

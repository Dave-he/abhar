package org.harm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 物品
 * @author hyx
 * @date 2024/11/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "item_price")
public class ItemPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String note;

    private String img;
}

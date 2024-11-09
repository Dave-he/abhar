package org.harm.entity;

import org.harm.common.JsonObjectConverter;

import jakarta.json.JsonObject;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
@Entity(name = "goods")
public class Goods extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "note")
    private String note;

    @Column(name = "img")
    private String img;

    @Column(name = "ext_info", columnDefinition = "JSON")
    @Convert(converter = JsonObjectConverter.class)
    private JsonObject extInfo;
}

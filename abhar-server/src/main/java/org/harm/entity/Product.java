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
@Entity(name = "product")
public class Product extends BaseEntity {

    @Column(name = "name")
    private String name; // 名称

    @Column(name = "description")
    private String description; // 描述

    @Column(name = "category_id")
    private Long category_id; // 类别

    @Column(name = "brand")
    private String brand; // 品牌

    @Column(name = "model")
    private String model; // 型号

    @Column(name = "specification", columnDefinition = "JSON")
    @Convert(converter = JsonObjectConverter.class)
    private JsonObject specification; // 规格

    @Column(name = "img_list")
    private String imgList; // 图片

    @Column(name = "remark")
    private String remark; // 备注

    @Column(name = "ext_info", columnDefinition = "JSON")
    @Convert(converter = JsonObjectConverter.class)
    private JsonObject extInfo; // 扩展信息
}

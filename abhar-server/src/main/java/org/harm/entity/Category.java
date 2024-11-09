package org.harm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author hyx
 * @date 2024/11/8
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity(name = "category")
public class Category extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "note")
    private String note;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "level")
    private Integer level;
    @Column(name = "sort")
    private Integer sort;
    @Column(name = "status", columnDefinition = "TINYINT(4)")
    private Integer status;
}

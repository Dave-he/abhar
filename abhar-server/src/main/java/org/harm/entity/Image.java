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
@Entity(name = "image")
public class Image extends BaseEntity {

    @Column(name = "file_name")
    private String fileName; // 文件名

    @Column(name = "url")
    private String url; //路径

    @Column(name = "file_extension")
    private String fileExtension; // 文件扩展名

    @Column(name = "file_size")
    private Long fileSize; // 文件大小

    @Column(name = "source_tyoe", columnDefinition = "TINYINT(4)")
    private Integer sourceType; //来源类别
}

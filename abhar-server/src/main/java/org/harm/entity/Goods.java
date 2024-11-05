package org.harm.entity;

import io.quarkus.arc.All;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hyx
 * @date 2024/11/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String note;

    private String img;
}

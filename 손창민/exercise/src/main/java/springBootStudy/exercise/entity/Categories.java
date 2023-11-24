package springBootStudy.exercise.entity;

import lombok.*;
import springBootStudy.exercise.entity.common.BaseEntity;
import springBootStudy.exercise.entity.enums.CategoryType;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Categories extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private CategoryType category;

    @Builder
    public Categories(CategoryType category) {
        this.category = category;
    }
}

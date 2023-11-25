package springBootStudy.exercise.domain.entity;

import lombok.*;
import springBootStudy.exercise.domain.common.BaseEntity;
import springBootStudy.exercise.domain.enums.CategoryType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Categories")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private CategoryType categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<BoardCategory> boardCategories = new ArrayList<>();

    @Builder
    public Category(CategoryType category) {
        this.categoryName = category;
    }
}

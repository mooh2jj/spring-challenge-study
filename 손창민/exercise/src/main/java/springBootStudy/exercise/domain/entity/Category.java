package springBootStudy.exercise.domain.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import springBootStudy.exercise.domain.common.BaseEntity;
import springBootStudy.exercise.domain.enums.CategoryType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BoardCategory> boardCategories = new LinkedHashSet<>();

    @Builder
    public Category(CategoryType category) {
        this.categoryName = category;
    }
}

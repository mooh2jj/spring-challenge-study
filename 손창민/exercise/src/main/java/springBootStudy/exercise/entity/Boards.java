package springBootStudy.exercise.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import springBootStudy.exercise.entity.common.BaseEntity;
import springBootStudy.exercise.entity.common.StatusCode;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Entity
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Boards extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String korTitle;
    private String engTitle;
    @Column(nullable = false)
    private String description;
    @ColumnDefault("0")
    private Integer view;

    @Column(columnDefinition = "VARCHAR(10) NOT NULL DEFAULT 'activate'")
    @Enumerated(EnumType.STRING)
    private StatusCode status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    public Boards(String korTitle, String engTitle, String description, Integer view, StatusCode status) {
        this.korTitle = korTitle;
        this.engTitle = engTitle;
        this.description = description;
        this.view = view;
        this.status = status;
    }
}

package springBootStudy.exercise.domain.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import springBootStudy.exercise.domain.common.BaseEntity;
import springBootStudy.exercise.domain.common.StatusCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity(name = "Boards")
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Board extends BaseEntity {
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
    private User user;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<BoardCategory> boardCategories = new ArrayList<>();

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Board(String korTitle, String engTitle, String description, Integer view, StatusCode status) {
        this.korTitle = korTitle;
        this.engTitle = engTitle;
        this.description = description;
        this.view = view;
        this.status = status;
    }
}

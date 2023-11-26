package springBootStudy.exercise.domain.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import springBootStudy.exercise.domain.common.BaseEntity;
import springBootStudy.exercise.domain.common.StatusCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BoardCategory> boardCategories = new LinkedHashSet<>();

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Comment> comments = new LinkedHashSet<>();

    @Builder
    public Board(String korTitle, String engTitle, String description, Integer view, StatusCode status) {
        this.korTitle = korTitle;
        this.engTitle = engTitle;
        this.description = description;
        this.view = view;
        this.status = status;
    }

    public void addCategory(Category category){
        boardCategories.add(
                BoardCategory.builder()
                        .board(this)
                    .category(category)
                    .build()
        );
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
}

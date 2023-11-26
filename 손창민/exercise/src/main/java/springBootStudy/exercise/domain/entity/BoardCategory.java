package springBootStudy.exercise.domain.entity;

import lombok.*;
import springBootStudy.exercise.domain.common.BaseEntity;

import javax.persistence.*;

@Entity(name ="BoardCategories")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BoardCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public BoardCategory(Board board, Category category) {
        this.board = board;
        this.category = category;
    }
}

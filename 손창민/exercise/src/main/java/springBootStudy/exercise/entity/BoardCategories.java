package springBootStudy.exercise.entity;

import lombok.*;
import springBootStudy.exercise.entity.common.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BoardCategories extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Boards board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categories category;

    @Builder
    public BoardCategories(Boards board, Categories category) {
        this.board = board;
        this.category = category;
    }
}

package springBootStudy.exercise.domain.entity;

import lombok.*;
import springBootStudy.exercise.domain.common.BaseEntity;

import javax.persistence.*;

@Getter
@Entity(name = "Comments")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @Builder
    public Comment(String content) {
        this.content = content;
    }

}

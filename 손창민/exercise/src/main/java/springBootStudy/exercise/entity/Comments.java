package springBootStudy.exercise.entity;

import lombok.*;
import springBootStudy.exercise.entity.common.BaseEntity;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Comments extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Builder
    public Comments(String content) {
        this.content = content;
    }

}

package springBootStudy.exercise.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import springBootStudy.exercise.entity.common.BaseEntity;
import springBootStudy.exercise.entity.common.StatusCode;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private String name;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 18, nullable = false)
    private String password;

    @Column(columnDefinition = "VARCHAR(10) NOT NULL DEFAULT 'activate'")
    @Enumerated(EnumType.STRING)
    private StatusCode status;

    @Builder
    public Users(String name, String email, String password, StatusCode status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }
}

package springBootStudy.exercise.domain.entity;

import lombok.*;
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

@Entity(name = "Users")
@Getter
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {
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

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Comment> comments = new LinkedHashSet<>();

    @Builder
    public User(String name, String email, String password, StatusCode status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }
}

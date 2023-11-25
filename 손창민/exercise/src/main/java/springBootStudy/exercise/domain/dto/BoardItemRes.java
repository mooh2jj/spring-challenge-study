package springBootStudy.exercise.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springBootStudy.exercise.domain.enums.CategoryType;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardItemRes {
    private Long id;
    private List<CategoryType> categories;
    private Integer view;
    private String korTitle;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

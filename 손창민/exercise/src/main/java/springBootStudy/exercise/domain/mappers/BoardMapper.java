package springBootStudy.exercise.domain.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springBootStudy.exercise.domain.dto.BoardItemRes;
import springBootStudy.exercise.domain.entity.Board;
import springBootStudy.exercise.domain.entity.BoardCategory;
import springBootStudy.exercise.domain.entity.Category;
import springBootStudy.exercise.domain.enums.CategoryType;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    @Mapping(source = "boardCategories", target = "categories")
    BoardItemRes toBoardItemRes(Board board);

    default CategoryType toCategory(BoardCategory boardCategory){
        return boardCategory.getCategory().getCategoryName();
    }
}

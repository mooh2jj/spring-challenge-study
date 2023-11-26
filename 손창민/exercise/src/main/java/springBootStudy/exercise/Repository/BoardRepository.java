package springBootStudy.exercise.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import springBootStudy.exercise.domain.entity.Board;

import java.util.List;

import static springBootStudy.exercise.domain.entity.QBoard.board;
import static springBootStudy.exercise.domain.entity.QBoardCategory.boardCategory;

@Repository
@AllArgsConstructor
public class BoardRepository {
    private final JPAQueryFactory queryFactory;

    public List<Board> findAllBoardsByCategory(Long categoryId){
        return queryFactory
                .select(board)
                .from(board)
                .leftJoin(board.boardCategories, boardCategory)
                .on(boardCategory.category.id.eq(categoryId))
                .distinct()
                .fetch();
    }
}

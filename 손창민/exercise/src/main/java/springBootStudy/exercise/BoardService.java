package springBootStudy.exercise;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springBootStudy.exercise.Repository.BoardRepository;
import springBootStudy.exercise.domain.dto.BoardItemRes;
import springBootStudy.exercise.domain.mappers.BoardMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    public List<BoardItemRes> boardListByCategory(Long categoryId){
        return boardRepository.findAllBoardsByCategory(categoryId)
                .stream()
                .map(boardMapper::toBoardItemRes)
                .collect(Collectors.toList());
    }
}

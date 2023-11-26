package springBootStudy.exercise.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springBootStudy.exercise.BoardService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/category/{categoryId}/board/list")
    public ResponseEntity<?> getBoardListByCategories(
            @PathVariable Long categoryId
    ){
        return ResponseEntity.ok(boardService.boardListByCategory(categoryId));
    }
}

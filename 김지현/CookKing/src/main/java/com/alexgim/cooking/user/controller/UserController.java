package com.alexgim.cooking.user.controller;

import com.alexgim.cooking.user.data.dto.UserPostDto;
import com.alexgim.cooking.user.data.dto.UserPutDto;
import com.alexgim.cooking.user.data.dto.UserResponseDto;
import com.alexgim.cooking.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        System.out.println(id);
        if(id < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("존재하지 않는 인덱스입니다");
        }
        UserResponseDto userResponseDto = userService.readUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);
    }

    @PostMapping
    public ResponseEntity enrollUser(@Valid @RequestBody UserPostDto userPostDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError fieldError = (FieldError) objectError;
                String defaultMessage = objectError.getDefaultMessage();

                sb.append("field : " + fieldError.getField()).append(", message : " + defaultMessage);
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        UserResponseDto userResponseDto = userService.signUp(userPostDto);
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity modifyUser(@PathVariable Long id, @Valid @RequestBody UserPutDto userPutDto, BindingResult bindingResult) {
        if(id < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("존재하지 않는 인덱스입니다");
        }
        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError fieldError = (FieldError) objectError;
                String defaultMessage = objectError.getDefaultMessage();

                sb.append("field : " + fieldError.getField()).append(", message : " + defaultMessage);
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        UserResponseDto userResponseDto = userService.updateUser(id, userPutDto);
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removeUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("계정이 삭제되었습니다");
    }

}

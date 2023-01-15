package com.alexgim.cooking.user.service;

import com.alexgim.cooking.user.data.dto.UserPostDto;
import com.alexgim.cooking.user.data.dto.UserPutDto;
import com.alexgim.cooking.user.data.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto signUp(UserPostDto userPostDto);

    UserResponseDto readUser(Long id);

    UserResponseDto updateUser(Long id, UserPutDto userPutDto);

    void deleteUser(Long id);
}

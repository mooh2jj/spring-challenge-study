package com.alexgim.cooking.user.service.impl;

import com.alexgim.cooking.user.data.dto.UserPostDto;
import com.alexgim.cooking.user.data.dto.UserPutDto;
import com.alexgim.cooking.user.data.dto.UserResponseDto;
import com.alexgim.cooking.user.data.entity.User;
import com.alexgim.cooking.user.data.repository.UserRepository;
import com.alexgim.cooking.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponseDto signUp(UserPostDto userPostDto) {
        User user = User.builder()
                .nickname(userPostDto.getNickname())
                .pwd(userPostDto.getPwd())
                .name(userPostDto.getName())
                .img(userPostDto.getImg())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        User save = userRepository.save(user);
        return UserResponseDto.builder()
                .nickname(save.getNickname())
                .name(save.getName())
                .img(save.getImg())
                .createdAt(save.getCreatedAt())
                .build();
    }

    @Override
    public UserResponseDto readUser(Long id) {
        User user = userRepository.findById(id).get();
        return UserResponseDto.builder()
                .nickname(user.getNickname())
                .name(user.getName())
                .img(user.getImg())
                .createdAt(user.getCreatedAt())
                .build();
    }

    @Override
    public UserResponseDto updateUser(Long id, UserPutDto userPutDto) {
        User user = userRepository.findById(id).get();
        user.setPwd(userPutDto.getPwd());
        user.setImg(userPutDto.getImg());
        user.setUpdatedAt(LocalDateTime.now());
        User save = userRepository.save(user);
        return UserResponseDto.builder()
                .nickname(save.getNickname())
                .name(save.getName())
                .img(save.getImg())
                .createdAt(save.getCreatedAt())
                .build();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

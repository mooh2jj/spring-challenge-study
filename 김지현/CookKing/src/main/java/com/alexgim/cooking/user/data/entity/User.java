package com.alexgim.cooking.user.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String nickname;
    private String pwd;
    private String name;
    private String img;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int status;
}

package com.alexgim.cooking.store.data.entity;

import com.alexgim.cooking.user.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "store")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = true)
    private Integer count;

    @Column(nullable = true)
    private Integer weight;

    private LocalDateTime createdAt;

    private  LocalDateTime expiration;
}

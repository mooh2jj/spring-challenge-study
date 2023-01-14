package com.alexgim.cooking.food.data.entity;

import com.alexgim.cooking.store.data.entity.Store;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Enabled
@Table(name = "food")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    private String name;
    private String category;
    private String info;
    private String img;
}

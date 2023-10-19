package com.example.springstudy.domain.coupon.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CouponType {

    DISCOUNT("할인"),
    POINT("포인트");

    private final String description;
}

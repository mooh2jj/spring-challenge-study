package com.example.springstudy.domain.coupon.service;

import com.example.springstudy.domain.coupon.dto.request.CouponCreateRequestDto;
import com.example.springstudy.domain.coupon.dto.response.CouponResponse;

import java.util.List;

public interface CouponService {

    CouponResponse createCoupon(CouponCreateRequestDto request);

    List<CouponResponse> getCoupons();
}

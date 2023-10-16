package com.example.springstudy.domain.coupon.service;

import com.example.springstudy.domain.coupon.dto.request.CouponCreateRequestDto;
import com.example.springstudy.domain.coupon.dto.response.CouponResponse;

public interface CouponService {

    CouponResponse createCoupon(CouponCreateRequestDto request);
}

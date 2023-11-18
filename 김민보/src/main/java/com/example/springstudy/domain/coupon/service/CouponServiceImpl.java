package com.example.springstudy.domain.coupon.service;

import com.example.springstudy.domain.coupon.dto.request.CouponCreateRequestDto;
import com.example.springstudy.domain.coupon.dto.response.CouponResponse;
import com.example.springstudy.domain.coupon.entity.Coupon;
import com.example.springstudy.domain.coupon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class CouponServiceImpl implements CouponService{

    private final CouponRepository couponRepository;

    @Transactional
    @Override
    public CouponResponse createCoupon(CouponCreateRequestDto request) {

        Coupon saveCoupon = couponRepository.save(request.toEntity());

        return CouponResponse.toDto(saveCoupon);
    }

    @Override
    public List<CouponResponse> getCoupons() {

        return couponRepository.findAll().stream()
                .map(CouponResponse::toDto)
                .collect(Collectors.toList());
    }
}

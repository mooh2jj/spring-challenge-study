package com.example.springstudy.domain.coupon.controller;

import com.example.springstudy.domain.coupon.dto.request.CouponCreateRequestDto;
import com.example.springstudy.domain.coupon.dto.response.CouponResponse;
import com.example.springstudy.domain.coupon.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class CouponController {

    private final CouponService couponService;

    @PostMapping("/coupon")
    public ResponseEntity<CouponResponse> createCoupon(@RequestBody CouponCreateRequestDto request) {

        CouponResponse coupon = couponService.createCoupon(request);

        return new ResponseEntity<>(coupon, HttpStatus.CREATED);
    }

    @GetMapping("/coupon")
    public ResponseEntity<List<CouponResponse>> getCoupons() {

        List<CouponResponse> coupons = couponService.getCoupons();

        return ResponseEntity.ok(coupons);
    }
}

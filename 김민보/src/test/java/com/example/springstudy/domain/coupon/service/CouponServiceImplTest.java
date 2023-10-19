package com.example.springstudy.domain.coupon.service;

import com.example.springstudy.domain.coupon.dto.request.CouponCreateRequestDto;
import com.example.springstudy.domain.coupon.dto.response.CouponResponse;
import com.example.springstudy.domain.coupon.entity.Coupon;
import com.example.springstudy.domain.coupon.entity.CouponStatus;
import com.example.springstudy.domain.coupon.entity.CouponType;
import com.example.springstudy.domain.coupon.repository.CouponRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
@ActiveProfiles("test")
class CouponServiceImplTest {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private CouponServiceImpl couponService;

    private Coupon coupon1;

    @BeforeEach
    void setUp() {

//        coupon1 = Coupon.builder()
//                    .id(1L)
//                    .name("쿠폰1")
//                    .code("코드1")
//                    .type(CouponType.POINT)
//                    .status(CouponStatus.PUBLIC)
//                    .startDate(LocalDate.of(2023, 10, 18))
//                    .endDate(LocalDate.of(2023, 10, 20))
//                    .build();
    }

    @AfterEach
    void after() {
        couponRepository.deleteAll();
    }

    @Test
    @DisplayName("쿠폰 생성 테스트")
    public void createCouponTest() {
        // given
        CouponCreateRequestDto requestDto = CouponCreateRequestDto.builder()
                .name("쿠폰1")
                .code("코드1")
                .type(CouponType.POINT)
                .status(CouponStatus.PUBLIC)
                .startDate(LocalDate.of(2023, 10, 18))
                .endDate(LocalDate.of(2023, 10, 20))
                .build();

        // when
        CouponResponse createdCoupon = couponService.createCoupon(requestDto);

        // then
        assertThat(createdCoupon.getId()).isEqualTo(1L);
        assertThat(createdCoupon.getName()).isEqualTo("쿠폰1");
    }

    @Test
    @DisplayName("쿠폰 리스트 테스트")
    public void getCouponsTest() {
        // given

        // when
        List<Coupon> coupons = couponRepository.findAll();

        // then
        assertThat(coupons).isNotEmpty();
    }
}
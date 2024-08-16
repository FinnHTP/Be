package com.project.backend.mapper;

import com.project.backend.dto.CouponDto;
import com.project.backend.entity.Coupon;

public class CouponMapper {
	public static CouponDto MapToDto(Coupon coupon) {
		return new CouponDto(coupon.getId(), coupon.getCoupon(), coupon.getValue());
	}
	public static Coupon MapToEntity(CouponDto couponDto) {
		Coupon coupon = new Coupon();
		coupon.setId(couponDto.getId());
		coupon.setCoupon(couponDto.getName());
		coupon.setValue(couponDto.getValue());
		return coupon;
	}
}

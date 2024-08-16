package com.project.backend.dto;

import com.project.backend.utilies.CouponName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponDto {
	private Long id;
	private CouponName name;
	Integer value;
}

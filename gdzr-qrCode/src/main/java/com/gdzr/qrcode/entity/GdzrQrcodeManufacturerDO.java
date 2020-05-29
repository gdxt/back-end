package com.gdzr.qrcode.entity;

import lombok.Data;

@Data
public class GdzrQrcodeManufacturerDO{

	private static final long serialVersionUID = 1L;

	/**
	 * 用户答题ID
	 */
	private String companyProfile;

	/**
	 * 问卷ID
	 */
	private String officialWebsite;
}

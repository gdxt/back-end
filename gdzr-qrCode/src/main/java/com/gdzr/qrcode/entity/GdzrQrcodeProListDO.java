package com.gdzr.qrcode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
public class GdzrQrcodeProListDO{
	//id自增主键
	private int equipmentId;
	//产品名称
	private String	equipment_name;
	//产品型号
	private String	model;
	//设备序列号
	private String	serial;
	//生产地址
	private String	adress;
	//产品简介
	private String	introduction;
	//文件地址
	private String	fileUrl;
	//图片地址
	private String	imageUrl;
	//客服热线
	private String	serviceHotline;
	//删除标记:未删除-UNDEL-1,删除-DEL-0
	private String	is_delete;
	//创建时间
	private Date gmt_create;
	//更新时间
	private Date gmtModified;
}

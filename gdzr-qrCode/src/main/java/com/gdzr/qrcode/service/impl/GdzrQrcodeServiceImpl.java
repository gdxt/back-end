package com.gdzr.qrcode.service.impl;

import com.gdzr.qrcode.dao.GdzrQrcodeDao;
import com.gdzr.qrcode.entity.GdzrQrcodeEquipmentDO;
import com.gdzr.qrcode.entity.GdzrQrcodeManufacturerDO;
import com.gdzr.qrcode.entity.GdzrQrcodeProListDO;
import com.gdzr.qrcode.service.GdzrQrcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GdzrQrcodeServiceImpl implements GdzrQrcodeService {

	@Autowired(required = false)
	private GdzrQrcodeDao GdzrQrcodeDao;

	@Override
	public List<GdzrQrcodeProListDO> proList() {
		return GdzrQrcodeDao.proList();
	}

	@Override
	public List<GdzrQrcodeEquipmentDO> equipmentArchives() {return GdzrQrcodeDao.equipmentArchives(); }

	@Override
	public List<GdzrQrcodeManufacturerDO> manufacturer() {
		return GdzrQrcodeDao.manufacturer();
	}
}

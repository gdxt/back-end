package com.gdzr.qrcode.service;

import com.gdzr.qrcode.entity.GdzrQrcodeEquipmentDO;
import com.gdzr.qrcode.entity.GdzrQrcodeManufacturerDO;
import com.gdzr.qrcode.entity.GdzrQrcodeProListDO;

import java.util.List;

public interface GdzrQrcodeService {

	List<GdzrQrcodeProListDO> proList();

	List<GdzrQrcodeEquipmentDO> equipmentArchives();

	List<GdzrQrcodeManufacturerDO> manufacturer();

}

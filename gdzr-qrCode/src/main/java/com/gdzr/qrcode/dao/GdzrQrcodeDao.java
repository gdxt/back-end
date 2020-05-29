package com.gdzr.qrcode.dao;

import com.gdzr.qrcode.entity.GdzrQrcodeEquipmentDO;
import com.gdzr.qrcode.entity.GdzrQrcodeManufacturerDO;
import com.gdzr.qrcode.entity.GdzrQrcodeProListDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GdzrQrcodeDao {

	List<GdzrQrcodeProListDO> proList();

	List<GdzrQrcodeEquipmentDO> equipmentArchives();

	List<GdzrQrcodeManufacturerDO> manufacturer();

}

package com.gdzr.qrcode.controller;

import com.gdzr.qrcode.entity.GdzrQrcodeEquipmentDO;
import com.gdzr.qrcode.entity.GdzrQrcodeManufacturerDO;
import com.gdzr.qrcode.entity.GdzrQrcodeProListDO;
import com.gdzr.qrcode.service.GdzrQrcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qrcode")
public class QrcodeController {

	@Autowired
	private GdzrQrcodeService qrcodeService;

	@GetMapping("/manufacturer")
	public List<GdzrQrcodeManufacturerDO> manufacturer(){
		return qrcodeService.manufacturer();
	}

	@GetMapping("/equipmentArchives")
	public List<GdzrQrcodeEquipmentDO> equipmentArchives(){
		return qrcodeService.equipmentArchives();
	}

	@GetMapping("/proList")
	public List<GdzrQrcodeProListDO> proList(){
		List<GdzrQrcodeProListDO> result = qrcodeService.proList();
		System.out.println(result.toString());
		return qrcodeService.proList();
	}
}

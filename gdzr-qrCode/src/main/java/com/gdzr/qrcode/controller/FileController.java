package com.gdzr.qrcode.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {
	@PostMapping(value = "/upload")
	@ResponseBody
	public String upload(@RequestParam("file")MultipartFile file){
		try{
			if(file.isEmpty()){
				return "file is empty";
			}
			String fileName = file.getOriginalFilename();
			String suffixName = fileName.substring(fileName.lastIndexOf("."));
			System.out.println("上传的文件名为："+fileName+"后缀为："+suffixName);
			String filePath ="/Users/tracey/workspace/FileUpload/src/file";
			String path = filePath+fileName;
			File dest = new File(path);
			//检测是否存在目录
			if(!dest.getParentFile().exists()){
				dest.getParentFile().mkdir();//新建文件夹
			}
			file.transferTo(dest);//文件写入
			return "upload success";
		}catch (IllegalStateException e){
			e.printStackTrace();
		}catch (IOException e ){
			e.printStackTrace();
		}
		return "uploda fail";
	}
}

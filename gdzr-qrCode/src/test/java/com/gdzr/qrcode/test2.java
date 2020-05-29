package com.gdzr.qrcode;

import com.gdzr.qrcode.qrcode.QRCodeUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test2 {

	@Test
	public void test() throws Exception {
		//存放二维码中的内容
		String text = "http://www.nmgdxt.com/";
		//嵌入二维码推按路径
		String imgPath = "/Users/tracey/Downloads/WechatIMG2813.png";
		//生成二维码图片的路径
		String destPath = "/Users/tracey/Downloads/testJam2.jpg";
		//生成二维码
		QRCodeUtil.encode(text, imgPath, destPath, true);
//		//解析二维码
//		String str = QRCodeUtil.decode(destPath);
//		//打印解析出的内容
//		System.out.println("result = " + str);
	}


}

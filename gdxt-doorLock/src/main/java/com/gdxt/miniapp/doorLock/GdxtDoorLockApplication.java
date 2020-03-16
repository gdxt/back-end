package com.gdxt.miniapp.doorLock;

import com.pig4cloud.pig.common.security.annotation.EnablePigFeignClients;
import com.pig4cloud.pig.common.security.annotation.EnablePigResourceServer;
import com.pig4cloud.pigx.common.swagger.annotation.EnablePigSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Author Vincentxin
 * @Date 2020/3/9
 */
@EnablePigSwagger2
@EnablePigResourceServer
@EnablePigFeignClients
@SpringCloudApplication
public class GdxtDoorLockApplication {
	public static void main(String[] args) {
		SpringApplication.run(GdxtDoorLockApplication.class, args);
	}
}

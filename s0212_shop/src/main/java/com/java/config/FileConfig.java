package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FileConfig implements WebMvcConfigurer{
	//images링크가 들어오면 찾는 위치를 c:upload에서 가져옴
	@Override 
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		//web 구축시 사용되는 images 위치를 지정
//		registry.addResourceHandler("/images/**")
//		.addResourceLocations("file:///c:/upload/");
		// 파일 업로드에서 파일 위치를 지정
		registry.addResourceHandler("/upload/board/**")
		.addResourceLocations("file:///c:/upload/board/");
	}
	
}

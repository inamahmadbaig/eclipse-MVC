package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

// Removed @Component, kept @Configuration
@Configuration
public class WebMVCConfiguer implements WebMvcConfigurer {

	@Autowired
	private LocaleChangeInterceptor inter;
	
	@Override // Good practice to add @Override here
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(inter);
	}
}
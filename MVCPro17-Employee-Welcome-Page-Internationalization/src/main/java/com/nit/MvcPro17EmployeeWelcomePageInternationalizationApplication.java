package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import java.util.Locale;

@SpringBootApplication
public class MvcPro17EmployeeWelcomePageInternationalizationApplication {

	// ADD THIS BEAN to tell Spring to store the chosen language in the user's session
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US); // Sets the default language to English US
		return slr;
	}

	// Your existing interceptor setup
	@Bean
	public LocaleChangeInterceptor changeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcPro17EmployeeWelcomePageInternationalizationApplication.class, args);
	}
}
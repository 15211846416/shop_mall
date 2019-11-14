package com.yi;

import com.yi.config.validate.VerifyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/**
	 * 注入验证码servlet
	 */
	@Bean
	public ServletRegistrationBean indexServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new VerifyServlet());
		registration.addUrlMappings("/getVerifyCode");
		return registration;
	}
}

package com.fruit.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication extends SpringBootServletInitializer {
	/**
	 * 入口类必须实现SpringBootServletInitializer接口的configure方法才能让外部容器运行
	 * @param builder
	 * @return
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}

	/**
	 * bootRun的时候会找有main方法的类，如果有多个就必须在build.gradle里面指定是哪个类
	 * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}
}

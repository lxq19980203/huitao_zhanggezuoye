package org.java201913.huitao_zhanggezuoye.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DruidConfig {

	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	//DataSource:数据源对象，包为javax.sql
	public DataSource getDataSource(){
		//DruidDataSourceBuilder.create().build()——创建Druid数据源
		return DruidDataSourceBuilder.create().build();
	}
}

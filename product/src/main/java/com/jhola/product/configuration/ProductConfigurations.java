package com.jhola.product.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfigurations {

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}

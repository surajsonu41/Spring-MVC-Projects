package com.vtalent.ioc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vtalent.ioc.Address;

@Configuration
public class IocConfiguration {
	
	@Bean
	public Address injectAddressObj() {
		Address address = new Address();
		
		address.setCity("hyd");
		address.setCountry("ind");
		address.setPincode("500011");
		return address;
	}

}

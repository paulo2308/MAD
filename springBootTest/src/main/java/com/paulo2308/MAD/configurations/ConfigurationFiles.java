package com.paulo2308.MAD.configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Setter
@Getter
public class ConfigurationFiles {

	private String addressUrl;
	private String addressZipFile;
	private String destinyFolder;

	@Profile("dev")
	@Bean
	public String testeConfig(){
		System.out.println("addressURL = " + addressUrl);
		System.out.println("addressZipFile = " + addressZipFile);
		System.out.println("destinyFolder = " + destinyFolder);
		return "sucesso";
	}

}

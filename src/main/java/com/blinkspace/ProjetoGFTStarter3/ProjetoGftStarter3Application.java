package com.blinkspace.ProjetoGFTStarter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //anotação para informar ao spring que sera consumido API de outro projeto
public class ProjetoGftStarter3Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoGftStarter3Application.class, args);
	}

}

package com.sunny.bank.payment.system.india.nach.nachpayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import som.sunny.bank.payment.system.main.MyService;

@SpringBootApplication
@ComponentScan(basePackages = "com.sunny")
public class NachpaymentApplication  {

	public static void main(String[] args) {
		SpringApplication.run(NachpaymentApplication.class, args);
	}

}

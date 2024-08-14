package com.jeff_dev.banco_digital_oo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeff_dev.banco_digital_oo.entity.Cliente;
import com.jeff_dev.banco_digital_oo.entity.conta.Conta;
import com.jeff_dev.banco_digital_oo.entity.conta.tipo.ContaCorrente;
import com.jeff_dev.banco_digital_oo.entity.conta.tipo.ContaPoupanca;

@SpringBootApplication
public class BancoDigitalOoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalOoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Cliente cliente1 = new Cliente("Jeff");

		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente1);

		cc.transferir(20.0, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}

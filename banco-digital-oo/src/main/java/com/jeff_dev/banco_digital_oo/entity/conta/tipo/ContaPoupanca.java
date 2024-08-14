package com.jeff_dev.banco_digital_oo.entity.conta.tipo;

import com.jeff_dev.banco_digital_oo.entity.Cliente;
import com.jeff_dev.banco_digital_oo.entity.conta.Conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca (Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
    }
    
}

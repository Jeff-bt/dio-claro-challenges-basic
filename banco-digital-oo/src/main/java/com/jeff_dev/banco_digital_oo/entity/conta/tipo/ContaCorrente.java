package com.jeff_dev.banco_digital_oo.entity.conta.tipo;

import com.jeff_dev.banco_digital_oo.entity.Cliente;
import com.jeff_dev.banco_digital_oo.entity.conta.Conta;

public class ContaCorrente extends Conta{

     public ContaCorrente (Cliente cliente) {
        super(cliente);
        depositar(100.00);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
    }
}

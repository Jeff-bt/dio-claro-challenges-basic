package com.jeff_dev.banco_digital_oo.entity.conta;

import com.jeff_dev.banco_digital_oo.entity.Cliente;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA_NUMERO_CONTA = 1;

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIA_NUMERO_CONTA++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void sacar(Double valor){
        saldo -= valor;
    }
    public void depositar(Double valor){
        saldo += valor;
    }
    public void transferir(Double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
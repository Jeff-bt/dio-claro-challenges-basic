package com.jeff_dev.banco_digital_oo.entity.conta;

public interface IConta {
    public void sacar(Double valor);
    public void depositar(Double valor);
    public void transferir(Double valor, Conta conta);
    public void imprimirExtrato();
}

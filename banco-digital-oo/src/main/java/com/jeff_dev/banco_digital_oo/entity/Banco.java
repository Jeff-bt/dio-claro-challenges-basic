package com.jeff_dev.banco_digital_oo.entity;

import java.util.List;

import com.jeff_dev.banco_digital_oo.entity.conta.Conta;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contas;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class ItemOrcamento implements Orcavel{
    
    private final BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public abstract class Desconto {
    
    protected Desconto proximo;
    
    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }
    
    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)) {
             return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
    
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}

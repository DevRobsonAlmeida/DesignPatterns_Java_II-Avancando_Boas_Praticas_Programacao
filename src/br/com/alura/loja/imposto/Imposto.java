/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;


/**
 *
 * @author robson-pc
 */
public abstract class Imposto {
    
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }
    
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
    
    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        if (outro != null) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }
}

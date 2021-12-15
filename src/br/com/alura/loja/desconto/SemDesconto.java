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
public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
       return BigDecimal.ZERO;
    }    

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}

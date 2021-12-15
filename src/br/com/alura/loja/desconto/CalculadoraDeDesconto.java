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
public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoPorQuantidadeDeItens(
            new DescontoParaValoresSuperior(
                new SemDesconto()));
        
        return cadeiaDeDescontos.calcular(orcamento);
    }

}

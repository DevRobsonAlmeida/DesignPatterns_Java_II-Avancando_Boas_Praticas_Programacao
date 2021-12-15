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
public class CalcularPorPorcentagem {
      
    public static BigDecimal CalcularPorPorcentagem(Orcamento orcamento, Double porcentagem){
        return orcamento.getValor().multiply(new BigDecimal(porcentagem));
    }
    
}

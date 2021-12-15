/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.imposto.enums;

import br.com.alura.loja.imposto.CalcularPorPorcentagem;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public enum TipoImposto {
    ICMS {
        @Override
        public BigDecimal calcularImporto(Orcamento orcamento) {
            return CalcularPorPorcentagem.CalcularPorPorcentagem(orcamento, 0.01);
        } 
    } ,
    ISS {
        @Override
        public BigDecimal calcularImporto(Orcamento orcamento) {
            return CalcularPorPorcentagem.CalcularPorPorcentagem(orcamento, 0.06);
        }
    };

    public abstract BigDecimal calcularImporto(Orcamento orcamento);

}

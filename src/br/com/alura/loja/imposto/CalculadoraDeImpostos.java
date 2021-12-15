/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.imposto;

import br.com.alura.loja.imposto.enums.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class CalculadoraDeImpostos {

    //Utilizado dois metodos de chamada, 
    //Um por Enum e outro por Interface
    public BigDecimal calcularUsandoEnum(Orcamento orcamento, TipoImposto imposto) {
        return imposto.calcularImporto(orcamento);
    }

    public BigDecimal calcularUsandoInterface(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}

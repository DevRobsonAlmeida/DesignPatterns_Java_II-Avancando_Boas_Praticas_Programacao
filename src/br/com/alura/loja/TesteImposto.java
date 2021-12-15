package br.com.alura.loja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"));
        CalculadoraDeImpostos Calculadora = new CalculadoraDeImpostos();
//        System.out.println(String.format("%.2f", Calculadora.calcularUsandoEnum(orcamento, TipoImposto.ISS)));
        System.out.println(Calculadora.calcularUsandoInterface(orcamento, new ISS(null)));
    }
}

package br.com.alura.loja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento( new BigDecimal("500")));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento( new BigDecimal("1000")));
        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        
        CalculadoraDeDesconto Calculadora = new CalculadoraDeDesconto();
        System.out.println(Calculadora.calcular(primeiro));
        System.out.println(Calculadora.calcular(segundo));
        System.out.println(Calculadora.calcular(terceiro));
    }
}

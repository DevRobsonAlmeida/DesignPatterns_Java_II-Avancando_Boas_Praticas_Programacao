/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import java.math.BigDecimal;

/**
 *
 * @author robson-pc
 */
public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.ZERO));
        orcamento.aprovar();
        orcamento.finalizar();
        
        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.regitrar(orcamento);
    }
}

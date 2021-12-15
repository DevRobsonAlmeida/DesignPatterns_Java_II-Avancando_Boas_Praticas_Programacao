/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author robson-pc
 */
public class TestePedidos {

    public static void main(String[] args) {
        String[] pedido = new String[3];
        pedido[0] = "Robson";
        pedido[1] = "20";
        pedido[2] = "2";
        String cliente = pedido[0];
        
        
        BigDecimal valorOrcamento = new BigDecimal(pedido[1]);
        int quantidadeItens = Integer.parseInt(pedido[2]);
        
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedido(),
                        new EnviarEmailPedido(),
                        new LogDePedido())
        );
        handler.execute(gerador);
                
    }
}

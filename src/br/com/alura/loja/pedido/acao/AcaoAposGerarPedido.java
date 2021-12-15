/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

/**
 *
 * @author robson-pc
 */
public interface AcaoAposGerarPedido{
    public void executar(Pedido pedido);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author robson-pc
 */
public class RegistroDeOrcamento {
    
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }
    
    public void regitrar(Orcamento orcamento){
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não finalizado!");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = new HashMap<String, Object>();
        dados.put("valor", orcamento.getValor());
        dados.put("quantidadeItens", orcamento.getQuantidadeItens());
        
        http.post(url, dados);
    }
}

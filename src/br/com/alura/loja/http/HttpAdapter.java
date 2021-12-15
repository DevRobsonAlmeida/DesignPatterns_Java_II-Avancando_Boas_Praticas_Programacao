/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.loja.http;

import java.util.Map;

/**
 *
 * @author robson-pc
 */
public interface HttpAdapter {
    void post(String url, Map<String, Object> dados);
}

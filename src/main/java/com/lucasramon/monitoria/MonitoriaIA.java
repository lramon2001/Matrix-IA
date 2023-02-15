/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lucasramon.monitoria;

import javax.swing.JOptionPane;


/**
 *
 * @author maicon
 */
public class MonitoriaIA {
    
    
    public static void main(String[] args) {
        
        IntegracaoChatGPT integracao = new IntegracaoChatGPT();
        
   
        
        String teste = integracao.pergunta("O que é hedonismo?");
        System.out.println(teste);
        System.out.println("Hello World!");
        
    }
}
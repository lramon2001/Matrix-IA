package com.lucasramon.monitoria;


import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class IntegracaoChatGPT {
    
    private static final String API_KEY ="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";
    private OpenAiService service;
    
    //text-curie-001
    //text-davinci-003
    public IntegracaoChatGPT() {
        this.service = new OpenAiService(API_KEY);
    }
    
    
    
    
    public String pergunta (String pergunta){
        
         
        CompletionRequest request = CompletionRequest.builder().model("text-davinci-003")
        .prompt(pergunta)
        .maxTokens(300)
        .build();
        
        
        
        String resposta = service.createCompletion(request).getChoices().toString();
        int startIndex = resposta.indexOf("text=") + 5;
        int endIndex = resposta.indexOf(", index");
        String resultado = resposta.substring(startIndex, endIndex);
        
        
        
        
        return resultado;
    }
    
}

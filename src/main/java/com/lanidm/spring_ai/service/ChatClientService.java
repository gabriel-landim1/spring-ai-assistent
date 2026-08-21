package com.lanidm.spring_ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatClientService {

    private final ChatClient chatClient;

    public ChatClientService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient
                .defaultSystem("Voce e um cowboy")
                .build();
    }

    public String response(String prompt){
        return this.chatClient
                .prompt()               // inicia a construção da mensagem
                .user(prompt)           // define o texto que o "usuário" está perguntando
                .call()                 // manda pra IA e espera a resposta
                .content();             // pega só o texto da resposta (sem metadados)
    }
}

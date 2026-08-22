package com.lanidm.spring_ai.controller;

import com.lanidm.spring_ai.service.ChatClientService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated // Necessário para o Spring validar parâmetros na URL
public class ChatClientController {

    private final ChatClientService chatClientService;

    public ChatClientController(ChatClientService chatClientService) {
        this.chatClientService = chatClientService;
    }

    @PostMapping("/chat")
    public ResponseEntity<String> pergunta(@RequestParam @NotBlank(message = "O prompt não pode estar vazio.") String prompt){
        return ResponseEntity.ok().body(chatClientService.response(prompt));
    }
}
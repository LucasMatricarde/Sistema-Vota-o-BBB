package com.lucasmatricarde.sistemavotacaobbb.controller;

import com.lucasmatricarde.sistemavotacaobbb.model.Participante;
import com.lucasmatricarde.sistemavotacaobbb.service.VotacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping ("/api/votacao")
public class VotacaoController {

    private final VotacaoService votacaoService;

    @PostMapping("/votar")
    public ResponseEntity<String> votar(@RequestBody Participante participante) {
        votacaoService.adicionarEvento(participante);
        return ResponseEntity.ok("Voto adicionado com sucesso");
    }
}

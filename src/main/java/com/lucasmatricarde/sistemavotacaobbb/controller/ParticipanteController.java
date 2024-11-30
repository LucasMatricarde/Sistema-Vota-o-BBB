package com.lucasmatricarde.sistemavotacaobbb.controller;

import com.lucasmatricarde.sistemavotacaobbb.model.Parametro;
import com.lucasmatricarde.sistemavotacaobbb.model.Participante;
import com.lucasmatricarde.sistemavotacaobbb.repository.ParticipanteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/participantes")
public class ParticipanteController {

    private final ParticipanteRepository participanteRepository;

    @PostMapping("/save")
    public ResponseEntity<Participante> save(@RequestBody Participante participante) {
        Participante savedParticipante = participanteRepository.save(participante);
        return ResponseEntity.ok(savedParticipante);
    }

    @GetMapping("/get")
    public ResponseEntity<Participante> get(@RequestParam String id) {
        Optional<Participante> optParticipanteFound = participanteRepository.findById(id);
        if(optParticipanteFound.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optParticipanteFound.get());
    }
}

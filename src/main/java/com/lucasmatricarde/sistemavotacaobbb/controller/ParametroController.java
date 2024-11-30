package com.lucasmatricarde.sistemavotacaobbb.controller;

import com.lucasmatricarde.sistemavotacaobbb.model.Parametro;
import com.lucasmatricarde.sistemavotacaobbb.repository.ParametroRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/parametros")
public class ParametroController {

    private final ParametroRepository parametroRepository;

    @PostMapping("/save")
    public ResponseEntity<Parametro> save(@RequestBody Parametro parametro) {
        Parametro savedParametro = parametroRepository.save(parametro);
        return ResponseEntity.ok(savedParametro);
    }

    @GetMapping("/get")
    public ResponseEntity<Parametro> get(@RequestParam String key) {
        Optional<Parametro> optParametroFound = parametroRepository.findById(key);
        if(optParametroFound.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optParametroFound.get());
    }
}

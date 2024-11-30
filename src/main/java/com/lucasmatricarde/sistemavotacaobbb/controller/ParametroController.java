package com.lucasmatricarde.sistemavotacaobbb.controller;

import com.lucasmatricarde.sistemavotacaobbb.model.ParametroModel;
import com.lucasmatricarde.sistemavotacaobbb.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
public class ParametroController {

    private final ParametroRepository parametroRepository;

    public ParametroController(ParametroRepository parametroRepository) {
        this.parametroRepository = parametroRepository;
    }

    @PostMapping("/save")
    public ResponseEntity<ParametroModel> save(@RequestBody ParametroModel parametroModel) {
        ParametroModel savedParametroModel = parametroRepository.save(parametroModel);
        return ResponseEntity.ok(savedParametroModel);
    }

    @GetMapping("/get")
    public ResponseEntity<ParametroModel> get(@RequestParam String key) {
        Optional<ParametroModel> optParametroModelFound = parametroRepository.findById(key);
        if(optParametroModelFound.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optParametroModelFound.get());
    }
}

package com.lucasmatricarde.sistemavotacaobbb.service;

import com.lucasmatricarde.sistemavotacaobbb.model.Participante;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VotacaoService {

    private static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public void adicionarEvento(Participante participante) {
        kafkaTemplate.send(TOPICO_VOTACAO, participante);
    }
}

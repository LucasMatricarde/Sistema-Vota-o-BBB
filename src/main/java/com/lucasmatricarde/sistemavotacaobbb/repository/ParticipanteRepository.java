package com.lucasmatricarde.sistemavotacaobbb.repository;

import com.lucasmatricarde.sistemavotacaobbb.model.Participante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<Participante, String> {

}

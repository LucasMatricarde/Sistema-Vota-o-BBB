package com.lucasmatricarde.sistemavotacaobbb.repository;

import com.lucasmatricarde.sistemavotacaobbb.model.Parametro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<Parametro, String> {

}

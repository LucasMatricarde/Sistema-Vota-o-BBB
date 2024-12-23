package com.lucasmatricarde.sistemavotacaobbb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "parametro")
public class Parametro {

    @Id
    private String key;
    private String value;

}

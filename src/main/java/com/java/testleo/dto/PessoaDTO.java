package com.java.testleo.dto;

import lombok.Data;

@Data
public class PessoaDTO {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private Boolean ativo;
}

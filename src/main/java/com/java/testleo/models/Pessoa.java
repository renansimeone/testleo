package com.java.testleo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "email", length = 50, unique = true)
    private String email;
    @Column(name = "cpf", length = 11, unique = true)
    private String cpf;
    @Column(name = "ativo")
    private Boolean ativo;
}

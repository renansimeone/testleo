package com.java.testleo.services;

import com.java.testleo.models.Pessoa;
import com.java.testleo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> listar() { return pessoaRepository.findAll();}


}

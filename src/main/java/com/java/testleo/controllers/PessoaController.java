package com.java.testleo.controllers;

import com.java.testleo.dto.PessoaDTO;
import com.java.testleo.models.Pessoa;
import com.java.testleo.services.PessoaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    private ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/listar")
    public List<PessoaDTO> listar(){
        List<PessoaDTO> pessoaDTOList = new ArrayList<>();
        List<Pessoa> pessoaList = pessoaService.listar();
        for(Pessoa p: pessoaList) {
            PessoaDTO pessoaDTO = modelMapper.map(p, PessoaDTO.class);
            pessoaDTOList.add(pessoaDTO);
        }
        return pessoaDTOList;
    }
}


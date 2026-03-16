package br.com.fiap.apiOscar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class OscarController {
    @GetMapping("/filme")
    public String filme(){
        return "Agente Secreto";
    }
    
    @GetMapping("/ator")
    public String ator(){
        return "Wagner Moura";
    }
    
    @GetMapping("/ano")
    public String ano(){
        return "dois mil e vinte e cinco";
    }
}

package br.com.santander.mssx.mssx.controller;

import br.com.santander.mssx.mssx.repository.IAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public String getHello(){

        return "arroz";
    }
}

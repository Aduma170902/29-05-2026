package com.aduma.computadorita.Controllers;

import com.aduma.computadorita.Tools.Calculadora;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("/expresion")
    public String calcularInfix(@RequestBody String infix){

        String postfix = Calculadora.convertirApostfix(infix);

        String resultado = Calculadora.resolverExpresionPostfix(postfix);

        return "Postfix: " + postfix + " Resultado: " + resultado;
    }
}
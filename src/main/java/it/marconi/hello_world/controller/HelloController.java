package it.marconi.hello_world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//stereotype annotation diventano un componente di springboot
//invertion of control
@Controller //bin
@RequestMapping("/") //TUTTE
public class HelloController {
    //CRUD create read update delete -> http

    @GetMapping //generica
    public String greet(){
        return "Hello-world "; //ha un riferimento ad una web page
    }

    //identificare un parametro
    @GetMapping(params = "papero")
    public String greetParameter() {
        return "Hello-world-param";
    }

    //MVC
    
}

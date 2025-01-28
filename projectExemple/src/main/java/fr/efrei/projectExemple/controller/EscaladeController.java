package fr.efrei.projectExemple.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/escalade")
public class EscaladeController {

    @Value("${name}")
    private String name;

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello " + name;
    }


}

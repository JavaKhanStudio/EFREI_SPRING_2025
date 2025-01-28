package fr.efrei.projectExemple.controller;

import fr.efrei.projectExemple.dto.MontagneDTO;
import fr.efrei.projectExemple.entity.Montagne;
import fr.efrei.projectExemple.mapping.MontagneMapping;
import fr.efrei.projectExemple.repo.MontagneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/montagne")
public class MontagneController {

    @Autowired
    private MontagneRepository montagneRepository;

    @Autowired
    private MontagneMapping montagneMapping;

    @GetMapping(path = "/{id}")
    public Montagne getMontagne(@PathVariable long id) {
        return montagneRepository.findById(id).get() ;
    }

    @GetMapping(path = "/montagne/precis")
    public Montagne getMontagnePrecis(@RequestParam(defaultValue = "nom") String nom) {

        return null ;
    }

    @PostMapping(path = "/montagne")
    public String addMontagne(@RequestBody MontagneDTO montagne) {

        Montagne montagne2 = montagneRepository.save(montagneMapping.dtoToEntity(montagne)) ;

        System.out.println(montagne2);
        return "OK" ;
    }






}

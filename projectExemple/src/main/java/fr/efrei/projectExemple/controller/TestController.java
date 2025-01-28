package fr.efrei.projectExemple.controller;

import fr.efrei.projectExemple.entity.Alpiniste;
import fr.efrei.projectExemple.entity.Montagne;
import fr.efrei.projectExemple.repo.AlpinisteRepo;
import fr.efrei.projectExemple.repo.MontagneRepository;
import fr.efrei.projectExemple.repo.StationMeteoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AlpinisteRepo alpinisteRepo;
    @Autowired
    private MontagneRepository montagneRepo;
    @Autowired
    private StationMeteoRepo stationMeteoRepo;


    @GetMapping
    public String test() {

        Montagne montagne = Montagne.builder().nom("Saint-Bruno").build();
        montagneRepo.save(montagne) ;

        Alpiniste alpiniste = Alpiniste.builder().nom("Robert").build();
        alpinisteRepo.save(alpiniste) ;

        Montagne montagne2 = montagneRepo.findById(montagne.getId()).get();
        montagne2.getAlpinisteList().add(alpiniste);
        montagneRepo.save(montagne2) ;

        return "Init" ;
    }

    @PostMapping("link/{idMontagne}/{idAlpiniste}")
    public String linkMontagneAlpiniste(@PathVariable long idMontagne, @PathVariable long idAlpiniste) {
        Optional<Montagne> montagneOpt = montagneRepo.findById(idMontagne) ;
        Optional<Alpiniste> alpinisteOpt = alpinisteRepo.findById(idAlpiniste) ;

        if(montagneOpt.isPresent() && alpinisteOpt.isPresent()) {
            Montagne montagne = montagneOpt.get() ;
            montagne.getAlpinisteList().add(alpinisteOpt.get());

            montagneRepo.save(montagne) ;
            return "OK" ;
        } else {
            return "PAS OK" ;
        }


    }

}

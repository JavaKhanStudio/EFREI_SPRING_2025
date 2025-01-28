package fr.efrei.projectExemple.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Montagne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String nom ;
    double temperatureMin ;
    double temperatureMax ;
    int altitude ;

    @OneToMany(mappedBy = "montagne")
    List<StationMeteo> stationMeteoList ;

    @ManyToMany
    List<Alpiniste> alpinisteList ;


}

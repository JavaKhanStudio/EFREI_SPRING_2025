package fr.efrei.projectExemple.mapping;

import fr.efrei.projectExemple.dto.MontagneDTO;
import fr.efrei.projectExemple.entity.Montagne;
import org.springframework.stereotype.Component;

@Component
public class MontagneMapping {


    public Montagne dtoToEntity(MontagneDTO montagneDTO) {
        return Montagne.builder()
                .nom(montagneDTO.nom())
                .temperatureMin(montagneDTO.temperatureMin())
                .temperatureMax(montagneDTO.temperatureMax())
                .altitude(montagneDTO.altitude())
                .build() ;
    }

    public MontagneDTO entityToDTO(Montagne montagne) {
        return MontagneDTO.builder()
                .nom(montagne.getNom())
                .temperatureMin(montagne.getTemperatureMin())
                .temperatureMax(montagne.getTemperatureMax())
                .altitude(montagne.getAltitude())
                .build();
    }

}

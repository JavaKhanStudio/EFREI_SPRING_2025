package fr.efrei.projectExemple.dto;

import lombok.Builder;

@Builder
public record MontagneDTO(String nom,
        double temperatureMin,
        double temperatureMax,
        int altitude) {
}

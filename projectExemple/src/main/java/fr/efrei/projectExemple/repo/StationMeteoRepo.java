package fr.efrei.projectExemple.repo;

import fr.efrei.projectExemple.entity.Alpiniste;
import fr.efrei.projectExemple.entity.StationMeteo;
import org.springframework.data.repository.CrudRepository;

public interface StationMeteoRepo extends CrudRepository<StationMeteo,Long> {
}
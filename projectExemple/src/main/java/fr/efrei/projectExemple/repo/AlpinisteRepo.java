package fr.efrei.projectExemple.repo;

import fr.efrei.projectExemple.entity.Alpiniste;
import fr.efrei.projectExemple.entity.Montagne;
import org.springframework.data.repository.CrudRepository;

public interface AlpinisteRepo extends CrudRepository<Alpiniste,Long> {
}

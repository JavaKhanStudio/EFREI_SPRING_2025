package fr.efrei.projectExemple.repo;

import fr.efrei.projectExemple.entity.Montagne;
import org.springframework.data.repository.CrudRepository;

public interface MontagneRepository extends CrudRepository<Montagne,Long> {
}

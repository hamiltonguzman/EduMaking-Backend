package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unab.edu.models.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}

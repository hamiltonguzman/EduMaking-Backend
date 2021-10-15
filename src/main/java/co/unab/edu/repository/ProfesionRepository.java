package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unab.edu.models.entity.Profesion;

@Repository
public interface ProfesionRepository extends JpaRepository<Profesion, Integer> {

}

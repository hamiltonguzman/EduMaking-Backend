package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unab.edu.models.entity.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

}

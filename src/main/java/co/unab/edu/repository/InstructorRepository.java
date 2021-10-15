package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.unab.edu.models.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer>{

}

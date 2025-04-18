package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.Commercial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommercialRepository extends JpaRepository<Commercial, Long> {
}

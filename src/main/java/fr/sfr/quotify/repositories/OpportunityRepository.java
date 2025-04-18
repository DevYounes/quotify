package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
}

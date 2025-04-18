package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.OpportunityLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityLineRepository extends JpaRepository<OpportunityLine, Long> {
}

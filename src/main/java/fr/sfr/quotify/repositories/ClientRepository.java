package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Customer, Long> {
}

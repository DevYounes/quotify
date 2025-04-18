package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

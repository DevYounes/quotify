package fr.sfr.quotify.repositories;

import fr.sfr.quotify.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String > {
}
